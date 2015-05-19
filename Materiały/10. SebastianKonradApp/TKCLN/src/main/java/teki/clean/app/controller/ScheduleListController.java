package teki.clean.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import teki.clean.app.dao.ScheduleDAO;
import teki.clean.app.model.Schedule;
import teki.clean.app.model.Schedule;

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
public class ScheduleListController {
	@Autowired
	private ScheduleDAO scheduleDao;
	
	@RequestMapping(value="/Schedule")
	public ModelAndView kutas() {
		List<Schedule> listSchedules = scheduleDao.list();
		ModelAndView model = new ModelAndView("ScheduleList");
		model.addObject("scheduleList", listSchedules);
		return model;
	}
	@RequestMapping(value = "/EditSchedule", method = RequestMethod.GET)
	public ModelAndView newSchedule() {
		ModelAndView model = new ModelAndView("ScheduleForm");
		model.addObject("schedule", new Schedule());
		return model;		
	}
	@RequestMapping(value = "/editSchedule", method = RequestMethod.GET)
	public ModelAndView editSchedule(HttpServletRequest request) {
		int schedule_id = Integer.parseInt(request.getParameter("schedule_id"));
		Schedule schedule = scheduleDao.get(schedule_id);
		ModelAndView model = new ModelAndView("ScheduleForm");
		model.addObject("schedule", schedule);
		return model;		
	}	
	@RequestMapping(value = "/deleteSchedule", method = RequestMethod.GET)
	public ModelAndView deleteSchedule(HttpServletRequest request) {
		int scheduleId = Integer.parseInt(request.getParameter("schedule_id"));
		scheduleDao.delete(scheduleId);
		return new ModelAndView("redirect:/");		
	}	
	@RequestMapping(value = "/saveSchedule", method = RequestMethod.POST)
	public ModelAndView saveSchedule(@ModelAttribute Schedule schedule) {
		scheduleDao.saveOrUpdate(schedule);
		return new ModelAndView("redirect:/");
	}
}
