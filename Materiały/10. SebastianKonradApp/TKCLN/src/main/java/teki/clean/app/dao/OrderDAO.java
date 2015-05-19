package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.Order;

public interface OrderDAO {
	public List<Order> list();
	public Order get(int order_id);
	public void saveOrUpdate(Order order);
	public void delete(int order_id);
}
