package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.Cleaner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class CleanerDAOImpl implements CleanerDAO {
	private SessionFactory sessionFactory;

	public CleanerDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Cleaner> list() {
		@SuppressWarnings("unchecked")
		List<Cleaner> listCleaner = (List<Cleaner>) sessionFactory.getCurrentSession()
				.createCriteria(Cleaner.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listCleaner;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Cleaner cleaner) {
		sessionFactory.getCurrentSession().saveOrUpdate(cleaner);
	}

	@Override
	@Transactional
	public void delete(int cleaner_id) {
		Cleaner cleanerToDelete = new Cleaner();
		cleanerToDelete.setCleaner_id(cleaner_id);
		sessionFactory.getCurrentSession().delete(cleanerToDelete);
	}

	@Override
	@Transactional
	public Cleaner get(int cleaner_id) {
		String hql = "from Cleaner where cleaner_id= " + cleaner_id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Cleaner> listCleaner = (List<Cleaner>) query.list();
		
		if (listCleaner != null && !listCleaner.isEmpty()) {
			return listCleaner.get(0);
		}
		
		return null;
	}

}
