package teki.clean.app.web;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import teki.clean.app.domain.Offers;
import teki.clean.app.domain.Schedules;
import teki.clean.app.domain.Users;
import teki.clean.app.domain.dto.CleanerFormDTO;
import teki.clean.app.service.CleanerManager;
import teki.clean.app.service.UserManager;

@Controller
@Scope("session")
@SessionAttributes("userManager")
public class CleanerController {

	private UserManager um;
	private CleanerManager cm = new CleanerManager( um.getUser() );
	
	@RequestMapping(value = "/cleanerPanel", method = RequestMethod.GET)
	public String cleanerMain(CleanerFormDTO cleanerData, ModelMap model) {
		cleanerData.setData( cm, um.getUser() );
		model.addAttribute( "cleanerData", cleanerData );
		return "cleanerPanel";
   }
	
	@RequestMapping(value = "/schedule", method = RequestMethod.GET)
	public String scheduleMain(ModelMap model) {
		model.addAttribute( "schedule", cm.getSchedules() );
		return "schedule";
   }
	
	@RequestMapping(value = "/scheduleEdit", method = RequestMethod.GET)
	public ModelAndView scheduleEditForm(ModelMap model) {
		return new ModelAndView( "scheduleEdit", "command", cm.getSchedules() );
   }
	
	@RequestMapping(value = "/scheduleEdit", method = RequestMethod.POST)
	public String scheduleEditSubmit(ArrayList<Schedules> schedules, ModelMap model) {
		model.addAttribute( "schedule", schedules );
		cm.setSchedules(schedules);
		return "schedule";
   }
	
	@RequestMapping(value = "/myOffers", method = RequestMethod.GET)
	public String offers(ModelMap model) {
		model.addAttribute( "offersList", cm.getOffers() );
		return "myOffers";
   }
	
	@RequestMapping(value = "/offerEdit", method = RequestMethod.GET)
	public ModelAndView offerEditForm(ModelMap model) {
		//Pobranie id oferty z odebranego zapytania klienta
		Integer offerId = null;
		return new ModelAndView( "offerEdit", "command", cm.getOffer(offerId) );
   }
	
	@RequestMapping(value = "/offerEdit", method = RequestMethod.POST)
	public String offerEditSubmit(Offers offer, ModelMap model) {
		model.addAttribute( "offer", offer );
		return "myOffers";
   }
	
	@RequestMapping(value = "/cleanerEdit", method = RequestMethod.GET)
	public ModelAndView cleanerEditForm(ModelMap model) {		
		return new ModelAndView( "cleanerEdit", "command", um.getUser() );
   }
	
	@RequestMapping(value = "/cleanerEdit", method = RequestMethod.POST)
	public String cleanerEditSubmit(Users user, ModelMap model) {
		model.addAttribute( "userData", user );
		return "cleanerPanel";
   }
}
