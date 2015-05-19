package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.Customer;

public interface CustomerDAO {
	public List<Customer> list();
	public Customer get(int customer_id);
	public void saveOrUpdate(Customer customer);
	public void delete(int customer_id);
}
