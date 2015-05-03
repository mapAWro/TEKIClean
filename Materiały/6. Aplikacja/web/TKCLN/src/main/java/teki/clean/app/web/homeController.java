package teki.clean.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import teki.clean.app.domain.User;

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
public class homeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
   public ModelAndView home(ModelMap model) {
		return new ModelAndView("home", "command", new MessageBlock());
   }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
   public String login(ModelMap model) {
		return "login";
   }
	
	@RequestMapping(value = "/signIn", method = RequestMethod.GET)
   public String signIn(ModelMap model) {
		return "signIn";
   }
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
   public String searchTek(@ModelAttribute("app/home")MessageBlock tekName, ModelMap model) {
		model.addAttribute("searchTek", tekName.getSearchParam() );
		return "searchTekResult";
   }

}
