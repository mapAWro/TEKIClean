package teki.clean.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import teki.clean.app.dao.OrderDAO;
import teki.clean.app.model.Order;
import teki.clean.app.model.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */

@Controller
public class OrderListController {
	@Autowired
	private OrderDAO orderDao;
	
	@RequestMapping(value="/Order")
	public ModelAndView kutas() {
		List<Order> listOrders = orderDao.list();
		ModelAndView model = new ModelAndView("OrderList");
		model.addObject("orderList", listOrders);
		return model;
	}
	@RequestMapping(value = "/EditOrder", method = RequestMethod.GET)
	public ModelAndView newOrder() {
		ModelAndView model = new ModelAndView("OrderForm");
		model.addObject("order", new Order());
		return model;		
	}
	@RequestMapping(value = "/editOrder", method = RequestMethod.GET)
	public ModelAndView editOrder(HttpServletRequest request) {
		int order_id = Integer.parseInt(request.getParameter("order_id"));
		Order order = orderDao.get(order_id);
		ModelAndView model = new ModelAndView("OrderForm");
		model.addObject("order", order);
		return model;		
	}	
	@RequestMapping(value = "/deleteOrder", method = RequestMethod.GET)
	public ModelAndView deleteOrder(HttpServletRequest request) {
		int orderId = Integer.parseInt(request.getParameter("order_id"));
		orderDao.delete(orderId);
		return new ModelAndView("redirect:/");		
	}	
	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
	public ModelAndView saveOrder(@ModelAttribute Order order) {
		orderDao.saveOrUpdate(order);
		return new ModelAndView("redirect:/");
	}
}
