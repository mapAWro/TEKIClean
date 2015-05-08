package teki.clean.app.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import teki.clean.app.domain.User;
import teki.clean.app.domain.Users;
import teki.clean.app.service.UserManager;

/**
 * Handles requests for the application home page.
 */
@Controller
@Scope("session")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	private UserManager um = new UserManager();

	@RequestMapping(value = "/userManagement", method = RequestMethod.GET)
	public String userManegementMain(Locale locale, Model model) {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.info("Number of users: {}.", um.getUsers().size());
		
		//Sekcja testowa
		//**************************
		//**************************
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute( "serverTime", formattedDate );
		model.addAttribute( "users", um.getUsers() );
		
		return "userManagement";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
      return new ModelAndView("addUser", "command", new User());
	}
		   
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("app/user")Users user, 
			ModelMap model) {
      model.addAttribute("name", user.getName() );
      model.addAttribute("lastName", user.getLastName() );
      um.addUser(user);
      return "addUserResult";
	}
	
}
