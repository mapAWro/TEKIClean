package teki.clean.app.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import teki.clean.app.domain.Users;
import teki.clean.app.domain.dto.UserSignInDTO;
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
@Scope("session")
@SessionAttributes("userManager")
public class HomeController {
	
	private UserManager um = new UserManager();
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
   public ModelAndView home(ModelMap model) {
		model.addAttribute( "userLogin", um.getUserLogin() );
		model.addAttribute("userManager", um);
		return new ModelAndView( "home", "command", new MessageBlock() );
   }
			
	@RequestMapping(value = "/home_Tsearch", method = RequestMethod.POST)
   public String searchTsubmit(MessageBlock tekName, ModelMap model) {
		model.addAttribute( "searchTek", tekName.getSearchParam() );
		return "searchTekResult";
   }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
   public ModelAndView logInForm(ModelMap model) {
		return new ModelAndView( "login", "command", new Users() );
   }
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
   public String logInSubmit(@ModelAttribute()Users user,  ModelMap model) {
		String page = "logInError";
		boolean state = um.logIn( user.getLogin(), user.getPassword() );
		if( state == true ){
			page = "userAccount";
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
		return "signInResult";
   }
	
	@RequestMapping(value = "/logOut")
   public String logOut(ModelMap model) {
		um.logOut();
		return "logOutResult";
   }
}
