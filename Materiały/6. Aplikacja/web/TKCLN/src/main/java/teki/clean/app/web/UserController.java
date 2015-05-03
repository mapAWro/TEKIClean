package teki.clean.app.web;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import teki.clean.app.domain.User;
import teki.clean.app.service.UserManager;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	private UserManager um;

	@RequestMapping(value = "/userManagement", method = RequestMethod.GET)
	public String userManegementMain(Locale locale, Model model) {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		
		//Sekcja testowa
		//**************************
		um = new UserManager();
		um.setUsers( new ArrayList<User>() );
		User user = new User();
		user.setUserID(1L);
		user.setName("Jan");
		user.setLastName("Kowalski");
		um.addUser(user);
		user = new User();
		user.setUserID(2L);
		user.setName("Adam");
		user.setLastName("Malinowski");
		um.addUser(user);
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
	public String addUser(@ModelAttribute("app/user")User user, 
			ModelMap model) {
      model.addAttribute("name", user.getName() );
      model.addAttribute("lastName", user.getLastName() );
      return "addUserResult";
	}
	
}
