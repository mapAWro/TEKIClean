package teki.clean.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import teki.clean.app.dao.CustomerDAO;
import teki.clean.app.model.Customer;
import teki.clean.app.model.Customer;

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
public class CustomerListController {
	@Autowired
	private CustomerDAO customerDao;
	
	@RequestMapping(value="/Customer")
	public ModelAndView kutas() {
		List<Customer> listCustomers = customerDao.list();
		ModelAndView model = new ModelAndView("CustomerList");
		model.addObject("customerList", listCustomers);
		return model;
	}
	@RequestMapping(value = "/EditCustomer", method = RequestMethod.GET)
	public ModelAndView newCustomer() {
		ModelAndView model = new ModelAndView("CustomerForm");
		model.addObject("customer", new Customer());
		return model;		
	}
	@RequestMapping(value = "/editCustomer", method = RequestMethod.GET)
	public ModelAndView editCustomer(HttpServletRequest request) {
		int customer_id = Integer.parseInt(request.getParameter("customer_id"));
		Customer customer = customerDao.get(customer_id);
		ModelAndView model = new ModelAndView("CustomerForm");
		model.addObject("customer", customer);
		return model;		
	}	
	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.GET)
	public ModelAndView deleteCustomer(HttpServletRequest request) {
		int customerId = Integer.parseInt(request.getParameter("customer_id"));
		customerDao.delete(customerId);
		return new ModelAndView("redirect:/");		
	}	
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {
		customerDao.saveOrUpdate(customer);
		return new ModelAndView("redirect:/");
	}
}
