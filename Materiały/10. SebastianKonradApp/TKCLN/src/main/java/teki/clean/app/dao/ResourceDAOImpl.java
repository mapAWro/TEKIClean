package teki.clean.app.dao;

import java.util.List;

import teki.clean.app.model.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class ResourceDAOImpl implements ResourceDAO {
	private SessionFactory sessionFactory;

	public ResourceDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Resource> list() {
		@SuppressWarnings("unchecked")
		List<Resource> listResource = (List<Resource>) sessionFactory.getCurrentSession()
				.createCriteria(Resource.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listResource;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Resource resource) {
		sessionFactory.getCurrentSession().saveOrUpdate(resource);
	}

	@Override
	@Transactional
	public void delete(int resource_id) {
		Resource resourceToDelete = new Resource();
		resourceToDelete.setResource_id(resource_id);
		sessionFactory.getCurrentSession().delete(resourceToDelete);
	}

	@Override
	@Transactional
	public Resource get(int resource_id) {
		String hql = "from Resource where resource_id= " + resource_id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Resource> listResource = (List<Resource>) query.list();
		
		if (listResource != null && !listResource.isEmpty()) {
			return listResource.get(0);
		}
		
		return null;
	}

}
