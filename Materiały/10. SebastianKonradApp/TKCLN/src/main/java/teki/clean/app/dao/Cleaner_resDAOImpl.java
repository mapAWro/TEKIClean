package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.Cleaner_res;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class Cleaner_resDAOImpl implements Cleaner_resDAO {
	private SessionFactory sessionFactory;

	public Cleaner_resDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Cleaner_res> list() {
		@SuppressWarnings("unchecked")
		List<Cleaner_res> listCleaner_res = (List<Cleaner_res>) sessionFactory.getCurrentSession()
				.createCriteria(Cleaner_res.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listCleaner_res;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Cleaner_res cleaner_res) {
		sessionFactory.getCurrentSession().saveOrUpdate(cleaner_res);
	}

	@Override
	@Transactional
	public void delete(int cleaner_res_id) {
		Cleaner_res cleaner_resToDelete = new Cleaner_res();
		cleaner_resToDelete.setCleaner_res_id(cleaner_res_id);
		sessionFactory.getCurrentSession().delete(cleaner_resToDelete);
	}

	@Override
	@Transactional
	public Cleaner_res get(int cleaner_res_id) {
		String hql = "from Cleaner_res where cleaner_res_id= " + cleaner_res_id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Cleaner_res> listCleaner_res = (List<Cleaner_res>) query.list();
		
		if (listCleaner_res != null && !listCleaner_res.isEmpty()) {
			return listCleaner_res.get(0);
		}
		
		return null;
	}

}
