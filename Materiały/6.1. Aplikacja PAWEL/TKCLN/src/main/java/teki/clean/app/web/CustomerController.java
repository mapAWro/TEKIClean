package teki.clean.app.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import teki.clean.app.domain.Opinions;
import teki.clean.app.domain.Orders;
import teki.clean.app.domain.Users;
import teki.clean.app.service.CustomerManager;
import teki.clean.app.service.UserManager;

@Controller
@Scope("session")
@SessionAttributes("userManager")
public class CustomerController {

	private UserManager um;
	private CustomerManager cstm = new CustomerManager( um.getUser() );

	@RequestMapping(value = "/customerPanel", method = RequestMethod.GET)
	public String customerMain(ModelMap model) {
		return "customerPanel";
   }	
	
	@RequestMapping(value = "/customerOffers", method = RequestMethod.GET)
	public String getOffers(ModelMap model) {
		model.addAttribute( "customerOffersList", cstm.getOffers() );
		return "customerOffers";
   }
	
	@RequestMapping(value = "/customerMakeOrder", method = RequestMethod.GET)
	public ModelAndView customerMakeOrderForm(ModelMap model) {		
		return new ModelAndView( "customerMakeOrder", "command", new Orders() );
   }
	
	@RequestMapping(value = "/customerMakeOrder", method = RequestMethod.POST)
	public String customerMakeOrderSubmit(Orders order, ModelMap model) {
		Integer offerId = null;	//pobrane z zapytania
		cstm.makeOrder(order, offerId);
		return "customerPanel";
   }
	
	@RequestMapping(value = "/customerRateOrder", method = RequestMethod.GET)
	public ModelAndView customerRateOrderForm(ModelMap model) {		
		return new ModelAndView( "customerRateOrder", "command", new Opinions() );
   }
	
	@RequestMapping(value = "/customerRateOrder", method = RequestMethod.POST)
	public String customerRateOrderSubmit(Opinions opinion, ModelMap model) {
		Integer orderId = null;	//pobrane z zapytania
		cstm.rateOrder(orderId, opinion);
		return "customerPanel";
   }
	
	@RequestMapping(value = "/customerRateCleaner", method = RequestMethod.GET)
	public ModelAndView customerRateCleanerForm(ModelMap model) {		
		return new ModelAndView( "customerRateCleaner", "command", new Opinions() );
   }
	
	@RequestMapping(value = "/customerRateCleaner", method = RequestMethod.POST)
	public String customerRateCleanerSubmit(Opinions opinion, ModelMap model) {
		Integer orderId = null;	//pobrane z zapytania
		cstm.rateCleaner(orderId, opinion);
		return "customerPanel";
   }
	
	@RequestMapping(value = "/customerEdit", method = RequestMethod.GET)
	public ModelAndView customerEditForm(ModelMap model) {		
		return new ModelAndView( "cleanerEdit", "command", um.getUser() );
   }
	
	@RequestMapping(value = "/customerEdit", method = RequestMethod.POST)
	public String customerEditSubmit(Users user, ModelMap model) {
		model.addAttribute( "userData", user );
		return "customerPanel";
   }
}
