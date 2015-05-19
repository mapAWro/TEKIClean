package teki.clean.app.dao;

import java.util.List;

import teki.clean.app.model.Offer;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class OfferDAOImpl implements OfferDAO {
	private SessionFactory sessionFactory;

	public OfferDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Offer> list() {
		@SuppressWarnings("unchecked")
		List<Offer> listOffer = (List<Offer>) sessionFactory.getCurrentSession()
				.createCriteria(Offer.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listOffer;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Offer offer) {
		sessionFactory.getCurrentSession().saveOrUpdate(offer);
	}

	@Override
	@Transactional
	public void delete(int offer_id) {
		Offer offerToDelete = new Offer();
		offerToDelete.setOffer_id(offer_id);
		sessionFactory.getCurrentSession().delete(offerToDelete);
	}

	@Override
	@Transactional
	public Offer get(int offer_id) {
		String hql = "from Offer where offer_id= " + offer_id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Offer> listOffer = (List<Offer>) query.list();
		
		if (listOffer != null && !listOffer.isEmpty()) {
			return listOffer.get(0);
		}
		
		return null;
	}

}
