package teki.clean.app.dao;

import java.util.List;

import teki.clean.app.model.Schedule;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class ScheduleDAOImpl implements ScheduleDAO {
	private SessionFactory sessionFactory;

	public ScheduleDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Schedule> list() {
		@SuppressWarnings("unchecked")
		List<Schedule> listSchedule = (List<Schedule>) sessionFactory.getCurrentSession()
				.createCriteria(Schedule.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listSchedule;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Schedule schedule) {
		sessionFactory.getCurrentSession().saveOrUpdate(schedule);
	}

	@Override
	@Transactional
	public void delete(int schedule_id) {
		Schedule scheduleToDelete = new Schedule();
		scheduleToDelete.setSchedule_id(schedule_id);
		sessionFactory.getCurrentSession().delete(scheduleToDelete);
	}

	@Override
	@Transactional
	public Schedule get(int schedule_id) {
		String hql = "from Schedule where schedule_id= " + schedule_id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Schedule> listSchedule = (List<Schedule>) query.list();
		
		if (listSchedule != null && !listSchedule.isEmpty()) {
			return listSchedule.get(0);
		}
		
		return null;
	}

}
