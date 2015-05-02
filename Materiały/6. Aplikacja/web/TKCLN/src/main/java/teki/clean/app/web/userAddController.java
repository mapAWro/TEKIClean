package teki.clean.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import teki.clean.app.domain.User;

@Controller
public class userAddController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
   public ModelAndView user() {
      return new ModelAndView("addUser", "command", new User());
   }
	   
   @RequestMapping(value = "/addUser", method = RequestMethod.POST)
   public String addUser(@ModelAttribute("app")User user, 
   ModelMap model) {
      model.addAttribute("name", user.getName() );
      model.addAttribute("lastName", user.getLastName() );
      
      return "addUserResult";
   }
}
