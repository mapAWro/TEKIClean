package teki.clean.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import teki.clean.app.dao.CleanerDAO;
import teki.clean.app.model.Cleaner;
import teki.clean.app.model.Cleaner;

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
public class CleanerListController {
	@Autowired
	private CleanerDAO cleanerDao;
	
	@RequestMapping(value="/Cleaner")
	public ModelAndView kutas() {
		List<Cleaner> listCleaners = cleanerDao.list();
		ModelAndView model = new ModelAndView("CleanerList");
		model.addObject("cleanerList", listCleaners);
		return model;
	}
	@RequestMapping(value = "/EditCleaner", method = RequestMethod.GET)
	public ModelAndView newCleaner() {
		ModelAndView model = new ModelAndView("CleanerForm");
		model.addObject("cleaner", new Cleaner());
		return model;		
	}
	@RequestMapping(value = "/editCleaner", method = RequestMethod.GET)
	public ModelAndView editCleaner(HttpServletRequest request) {
		int cleaner_id = Integer.parseInt(request.getParameter("cleaner_id"));
		Cleaner cleaner = cleanerDao.get(cleaner_id);
		ModelAndView model = new ModelAndView("CleanerForm");
		model.addObject("cleaner", cleaner);
		return model;		
	}	
	@RequestMapping(value = "/deleteCleaner", method = RequestMethod.GET)
	public ModelAndView deleteCleaner(HttpServletRequest request) {
		int cleanerId = Integer.parseInt(request.getParameter("cleaner_id"));
		cleanerDao.delete(cleanerId);
		return new ModelAndView("redirect:/");		
	}	
	@RequestMapping(value = "/saveCleaner", method = RequestMethod.POST)
	public ModelAndView saveCleaner(@ModelAttribute Cleaner cleaner) {
		cleanerDao.saveOrUpdate(cleaner);
		return new ModelAndView("redirect:/");
	}
}
