package teki.clean.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import teki.clean.app.dao.OfferDAO;
import teki.clean.app.model.Offer;
import teki.clean.app.model.Offer;

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
public class OfferListController {
	@Autowired
	private OfferDAO offerDao;
	
	@RequestMapping(value="/Offer")
	public ModelAndView kutas() {
		List<Offer> listOffers = offerDao.list();
		ModelAndView model = new ModelAndView("OfferList");
		model.addObject("offerList", listOffers);
		return model;
	}
	@RequestMapping(value = "/EditOffer", method = RequestMethod.GET)
	public ModelAndView newOffer() {
		ModelAndView model = new ModelAndView("OfferForm");
		model.addObject("offer", new Offer());
		return model;		
	}
	@RequestMapping(value = "/editOffer", method = RequestMethod.GET)
	public ModelAndView editOffer(HttpServletRequest request) {
		int offer_id = Integer.parseInt(request.getParameter("offer_id"));
		Offer offer = offerDao.get(offer_id);
		ModelAndView model = new ModelAndView("OfferForm");
		model.addObject("offer", offer);
		return model;		
	}	
	@RequestMapping(value = "/deleteOffer", method = RequestMethod.GET)
	public ModelAndView deleteOffer(HttpServletRequest request) {
		int offerId = Integer.parseInt(request.getParameter("offer_id"));
		offerDao.delete(offerId);
		return new ModelAndView("redirect:/");		
	}	
	@RequestMapping(value = "/saveOffer", method = RequestMethod.POST)
	public ModelAndView saveOffer(@ModelAttribute Offer offer) {
		offerDao.saveOrUpdate(offer);
		return new ModelAndView("redirect:/");
	}
}
