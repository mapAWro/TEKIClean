package teki.clean.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import teki.clean.app.dao.Cleaner_resDAO;
import teki.clean.app.model.Cleaner_res;
import teki.clean.app.model.Cleaner_res;

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
public class Cleaner_resListController {
	@Autowired
	private Cleaner_resDAO cleaner_resDao;
	
	@RequestMapping(value="/Cleaner_res")
	public ModelAndView kutas() {
		List<Cleaner_res> listCleaner_ress = cleaner_resDao.list();
		ModelAndView model = new ModelAndView("Cleaner_resList");
		model.addObject("cleaner_resList", listCleaner_ress);
		return model;
	}
	@RequestMapping(value = "/EditCleaner_res", method = RequestMethod.GET)
	public ModelAndView newCleaner_res() {
		ModelAndView model = new ModelAndView("Cleaner_resForm");
		model.addObject("cleaner_res", new Cleaner_res());
		return model;		
	}
	@RequestMapping(value = "/editCleaner_res", method = RequestMethod.GET)
	public ModelAndView editCleaner_res(HttpServletRequest request) {
		int cleaner_res_id = Integer.parseInt(request.getParameter("cleaner_res_id"));
		Cleaner_res cleaner_res = cleaner_resDao.get(cleaner_res_id);
		ModelAndView model = new ModelAndView("Cleaner_resForm");
		model.addObject("cleaner_res", cleaner_res);
		return model;		
	}	
	@RequestMapping(value = "/deleteCleaner_res", method = RequestMethod.GET)
	public ModelAndView deleteCleaner_res(HttpServletRequest request) {
		int cleaner_resId = Integer.parseInt(request.getParameter("cleaner_res_id"));
		cleaner_resDao.delete(cleaner_resId);
		return new ModelAndView("redirect:/");		
	}	
	@RequestMapping(value = "/saveCleaner_res", method = RequestMethod.POST)
	public ModelAndView saveCleaner_res(@ModelAttribute Cleaner_res cleaner_res) {
		cleaner_resDao.saveOrUpdate(cleaner_res);
		return new ModelAndView("redirect:/");
	}
}
