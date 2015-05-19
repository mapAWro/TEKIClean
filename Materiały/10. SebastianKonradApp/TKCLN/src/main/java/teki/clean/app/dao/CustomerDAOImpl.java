package teki.clean.app.dao;

import java.util.List;

import teki.clean.app.model.Customer;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class CustomerDAOImpl implements CustomerDAO {
	private SessionFactory sessionFactory;

	public CustomerDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Customer> list() {
		@SuppressWarnings("unchecked")
		List<Customer> listCustomer = (List<Customer>) sessionFactory.getCurrentSession()
				.createCriteria(Customer.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listCustomer;
	}
	
	@Override
	@Transactional
	public void saveOrUpdate(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	@Override
	@Transactional
	public void delete(int customer_id) {
		Customer customerToDelete = new Customer();
		customerToDelete.setCustomer_id(customer_id);
		sessionFactory.getCurrentSession().delete(customerToDelete);
	}

	@Override
	@Transactional
	public Customer get(int customer_id) {
		String hql = "from Customer where customer_id= " + customer_id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Customer> listCustomer = (List<Customer>) query.list();
		
		if (listCustomer != null && !listCustomer.isEmpty()) {
			return listCustomer.get(0);
		}
		
		return null;
	}

}
