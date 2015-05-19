package teki.clean.app.dao;

import java.util.List;

import teki.clean.app.model.Order;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class OrderDAOImpl implements OrderDAO {
	private SessionFactory sessionFactory;

	public OrderDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Order> list() {
		@SuppressWarnings("unchecked")
		List<Order> listOrder = (List<Order>) sessionFactory.getCurrentSession()
				.createCriteria(Order.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listOrder;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Order order) {
		sessionFactory.getCurrentSession().saveOrUpdate(order);
	}

	@Override
	@Transactional
	public void delete(int order_id) {
		Order orderToDelete = new Order();
		orderToDelete.setOrder_id(order_id);
		sessionFactory.getCurrentSession().delete(orderToDelete);
	}

	@Override
	@Transactional
	public Order get(int order_id) {
		String hql = "from Order where order_id= " + order_id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Order> listOrder = (List<Order>) query.list();
		
		if (listOrder != null && !listOrder.isEmpty()) {
			return listOrder.get(0);
		}
		
		return null;
	}

}
