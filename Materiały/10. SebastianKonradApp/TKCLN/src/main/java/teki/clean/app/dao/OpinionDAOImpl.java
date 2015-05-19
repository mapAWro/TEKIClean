package teki.clean.app.dao;

import java.util.List;

import teki.clean.app.model.Opinion;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class OpinionDAOImpl implements OpinionDAO {
	private SessionFactory sessionFactory;

	public OpinionDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Opinion> list() {
		@SuppressWarnings("unchecked")
		List<Opinion> listOpinion = (List<Opinion>) sessionFactory.getCurrentSession()
				.createCriteria(Opinion.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listOpinion;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Opinion opinion) {
		sessionFactory.getCurrentSession().saveOrUpdate(opinion);
	}

	@Override
	@Transactional
	public void delete(int opinion_id) {
		Opinion opinionToDelete = new Opinion();
		opinionToDelete.setOpinion_id(opinion_id);
		sessionFactory.getCurrentSession().delete(opinionToDelete);
	}

	@Override
	@Transactional
	public Opinion get(int opinion_id) {
		String hql = "from Opinion where opinion_id= " + opinion_id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Opinion> listOpinion = (List<Opinion>) query.list();
		
		if (listOpinion != null && !listOpinion.isEmpty()) {
			return listOpinion.get(0);
		}
		
		return null;
	}

}
