package teki.clean.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import teki.clean.app.domain.User;
import teki.clean.app.domain.Users;
import teki.clean.app.service.UserManager;

class MessageBlock{
	private String searchParam;

	public String getSearchParam() {
		return searchParam;
	}

	public void setSearchParam(String searchParam) {
		this.searchParam = searchParam;
	}
}

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
   public ModelAndView home(ModelMap model) {
		return new ModelAndView( "home", "command", new MessageBlock() );
   }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
   public ModelAndView logInForm(ModelMap model) {
		return new ModelAndView( "login", "command", new Users() );
   }
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
   public String logInSubmit(@ModelAttribute Users user,  ModelMap model) {			
		//Weryfikacja u¿ytkownika
		//if ( UserManager.checkPass(user) );
		return "home";
   }
	
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
   public ModelAndView signInForm(ModelMap model) {		
		//model.addAttribute( "user", new Users() );	
		//return "signIn";
		return new ModelAndView( "signIn", "command", new Users() );
   }
	
	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
   public String signInSubmit(@ModelAttribute Users user,  ModelMap model) {		
		//model.addAttribute( "users", user );	
		UserManager um = new UserManager();
		um.addUser(user);
		return "signInResult";
   }
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
   public String searchTek(MessageBlock tekName, ModelMap model) {
		model.addAttribute("searchTek", tekName.getSearchParam() );
		return "searchTekResult";
   }

}
