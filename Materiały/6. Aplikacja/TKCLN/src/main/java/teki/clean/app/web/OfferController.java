package teki.clean.app.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import teki.clean.app.domain.dto.CleanerFormDTO;
import teki.clean.app.service.UserManager;

@Controller
@Scope("session")
@SessionAttributes("userManager")
public class OfferController {
	private UserManager um;
	
	@RequestMapping(value = "/offers", method = RequestMethod.GET)
	public String offers(ModelMap model) {
		model.addAttribute( "offersList", um.getAllOffers() );
		return "offers";
   }
	
	@RequestMapping(value = "/offerDetails", method = RequestMethod.GET)
	public String offerDetails(ModelMap model) {
		//Pobranie danych o id wybranej oferty
		Integer offerId = null;
		model.addAttribute( "offerInfo", um.getOfferDetails(offerId) );
		return "offerDetails";
   }	
}
