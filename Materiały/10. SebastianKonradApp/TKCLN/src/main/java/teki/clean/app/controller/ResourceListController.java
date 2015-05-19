package teki.clean.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import teki.clean.app.dao.ResourceDAO;
import teki.clean.app.model.Resource;
import teki.clean.app.model.Resource;

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
public class ResourceListController {
	@Autowired
	private ResourceDAO resourceDao;
	
	@RequestMapping(value="/Resource")
	public ModelAndView kutas() {
		List<Resource> listResources = resourceDao.list();
		ModelAndView model = new ModelAndView("ResourceList");
		model.addObject("resourceList", listResources);
		return model;
	}
	@RequestMapping(value = "/EditResource", method = RequestMethod.GET)
	public ModelAndView newResource() {
		ModelAndView model = new ModelAndView("ResourceForm");
		model.addObject("resource", new Resource());
		return model;		
	}
	@RequestMapping(value = "/editResource", method = RequestMethod.GET)
	public ModelAndView editResource(HttpServletRequest request) {
		int resource_id = Integer.parseInt(request.getParameter("resource_id"));
		Resource resource = resourceDao.get(resource_id);
		ModelAndView model = new ModelAndView("ResourceForm");
		model.addObject("resource", resource);
		return model;		
	}	
	@RequestMapping(value = "/deleteResource", method = RequestMethod.GET)
	public ModelAndView deleteResource(HttpServletRequest request) {
		int resourceId = Integer.parseInt(request.getParameter("resource_id"));
		resourceDao.delete(resourceId);
		return new ModelAndView("redirect:/");		
	}	
	@RequestMapping(value = "/saveResource", method = RequestMethod.POST)
	public ModelAndView saveResource(@ModelAttribute Resource resource) {
		resourceDao.saveOrUpdate(resource);
		return new ModelAndView("redirect:/");
	}
}
