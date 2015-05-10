package teki.clean.app.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import teki.clean.app.domain.Users;
import teki.clean.app.service.UserManager;

/**
 * Handles requests for the application home page.
 */
@Controller
@Scope("session")
@SessionAttributes("userManager")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	private UserManager um;

	@RequestMapping(value = "/userManagement", method = RequestMethod.GET)
	public String userManegementMain(@ModelAttribute("userManager")UserManager um_, Model model) {
		
		/*logger.info("Number of users: {}.", um.getUsers().size());*/

		um = um_;
			
		model.addAttribute( "users", um.getUsers() );
		
		return "userManagement";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
      return new ModelAndView( "addUser", "command", new Users() );
	}
		   
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("app/user")Users user, 
			ModelMap model) {
      model.addAttribute("name", user.getName() );
      model.addAttribute("lastName", user.getLastName() );
      um.signInCleaner(user);
      return "addUserResult";
	}
	
}
