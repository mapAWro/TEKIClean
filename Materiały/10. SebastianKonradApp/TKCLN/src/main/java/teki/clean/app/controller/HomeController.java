package teki.clean.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import teki.clean.app.dao.ResourceDAO;
import teki.clean.app.model.Resource;
import teki.clean.app.dao.CleanerDAO;
import teki.clean.app.model.Cleaner;
import teki.clean.app.dao.UserDAO;
import teki.clean.app.model.User;

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
public class HomeController {
	
	
	@Autowired
	private ResourceDAO resourceDao;
	private CleanerDAO cleanerDao;
	private UserDAO userDao;
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("home");
		return model;
		
		
		//List<User> listUsers = userDao.list();
		//ModelAndView model = new ModelAndView("UserList");
		//model.addObject("userList", listUsers);
		//return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView logInForm() {
		ModelAndView model = new ModelAndView("login", "command", new User() );
		return model;
	}
	/* - Dokoñcz
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	   public String logInSubmit(@ModelAttribute()User user) {
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
	   }*/
	
	/*	Jackowy home
	 * @RequestMapping(value = "/", method = RequestMethod.GET)
   public String home(ModelMap model) {
		model.addAttribute( "userLogin", um.getUserLogin() );
		model.addAttribute("userManager", um);
		return "home";
   }*/
	
	/* Jackowe logowanie
		@RequestMapping(value = "/login", method = RequestMethod.GET)
   public ModelAndView logInForm(ModelMap model) {
		return new ModelAndView( "login", "command", new Users() );
   }
	 */

	
	/*
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newResource() {
		ModelAndView model = new ModelAndView("ResourceForm");
		model.addObject("resource", new Resource());
		return model;		
	}
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editResource(HttpServletRequest request) {
		int resource_id = Integer.parseInt(request.getParameter("resource_id"));
		Resource resource = resourceDao.get(resource_id);
		ModelAndView model = new ModelAndView("ResourceForm");
		model.addObject("resource", resource);
		return model;		
	}	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteResource(HttpServletRequest request) {
		int resourceId = Integer.parseInt(request.getParameter("resource_id"));
		resourceDao.delete(resourceId);
		return new ModelAndView("redirect:/");		
	}	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveResource(@ModelAttribute Resource resource) {
		resourceDao.saveOrUpdate(resource);
		return new ModelAndView("redirect:/");
	}*/
	
}
