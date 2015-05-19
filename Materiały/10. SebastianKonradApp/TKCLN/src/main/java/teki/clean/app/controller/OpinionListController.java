package teki.clean.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import teki.clean.app.dao.OpinionDAO;
import teki.clean.app.model.Opinion;
import teki.clean.app.model.Opinion;

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
public class OpinionListController {
	@Autowired
	private OpinionDAO opinionDao;
	
	@RequestMapping(value="/Opinion")
	public ModelAndView kutas() {
		List<Opinion> listOpinions = opinionDao.list();
		ModelAndView model = new ModelAndView("OpinionList");
		model.addObject("opinionList", listOpinions);
		return model;
	}
	@RequestMapping(value = "/EditOpinion", method = RequestMethod.GET)
	public ModelAndView newOpinion() {
		ModelAndView model = new ModelAndView("OpinionForm");
		model.addObject("opinion", new Opinion());
		return model;		
	}
	@RequestMapping(value = "/editOpinion", method = RequestMethod.GET)
	public ModelAndView editOpinion(HttpServletRequest request) {
		int opinion_id = Integer.parseInt(request.getParameter("opinion_id"));
		Opinion opinion = opinionDao.get(opinion_id);
		ModelAndView model = new ModelAndView("OpinionForm");
		model.addObject("opinion", opinion);
		return model;		
	}	
	@RequestMapping(value = "/deleteOpinion", method = RequestMethod.GET)
	public ModelAndView deleteOpinion(HttpServletRequest request) {
		int opinionId = Integer.parseInt(request.getParameter("opinion_id"));
		opinionDao.delete(opinionId);
		return new ModelAndView("redirect:/");		
	}	
	@RequestMapping(value = "/saveOpinion", method = RequestMethod.POST)
	public ModelAndView saveOpinion(@ModelAttribute Opinion opinion) {
		opinionDao.saveOrUpdate(opinion);
		return new ModelAndView("redirect:/");
	}
}
