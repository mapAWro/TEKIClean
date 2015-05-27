package teki.clean.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import teki.clean.app.dao.CleanerDAO;
import teki.clean.app.dao.CustomerDAO;
import teki.clean.app.dao.UserDAO;
import teki.clean.app.domain.dto.UserSignInDTO;
import teki.clean.app.model.User;
import teki.clean.app.service.UserManager;

@Controller
//@Scope("session")
//@SessionAttributes("userManager")
public class HomeController {
	
	@Autowired
	private UserDAO userDao;
	private CleanerDAO cleanerDAO;
	private CustomerDAO customerDAO;
	
	private UserManager um;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
   public String home(ModelMap model) {
		um = new UserManager(userDao, cleanerDAO, customerDAO);
		model.addAttribute( "userLogin", um.getUserLogin() );
		model.addAttribute("userManager", um);
		return "home";
   }
	
	@RequestMapping(value = "/userPRed")
	public String userRedirect(ModelMap model) {
		String page = new String("logInError");

		if ( um.getAuthLvl() == 0 ){
			page = "userManagement";
		}
		else if ( um.getAuthLvl() == 1 ){
			page = "cleanerPanel";			
					}
		else if ( um.getAuthLvl() == 2 ){
			page = "userAccount";
		}

		return page;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
   public ModelAndView logInForm(ModelMap model) {
		return new ModelAndView( "login", "command", new User() );
   }
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
   public String logInSubmit(@ModelAttribute()User user,  ModelMap model) {
		String page = "logInError";
		boolean state = um.logIn( user.getLogin(), user.getPassword() );
		if( state == true ){
			if ( um.getAuthLvl() == 0 ){
				page = "userAccount";
			}
			else if ( um.getAuthLvl() == 1 ){
				page = "cleanerPanel";			
						}
			else if ( um.getAuthLvl() == 2 ){
				page = "userAccount";
			}
		}
		return page;
   }
	
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
   public ModelAndView signInForm(ModelMap model) {		
		return new ModelAndView( "signIn", "command", new UserSignInDTO() );
   }
	
	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
   public String signInSubmit(@ModelAttribute()UserSignInDTO user,  ModelMap model) {
		um.signInCustomer( user.getUser(), user.getCustomer() );
		return "home";
   }
	
	@RequestMapping(value = "/logOut")
   public String logOut(ModelMap model) {
		um.logOut();
		return "home";
   }
}
