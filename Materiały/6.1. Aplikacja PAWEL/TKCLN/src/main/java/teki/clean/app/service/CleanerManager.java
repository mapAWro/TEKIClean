package teki.clean.app.service;

import java.util.ArrayList;

import teki.clean.app.domain.Cleaners;
import teki.clean.app.domain.Offers;
import teki.clean.app.domain.Opinions;
import teki.clean.app.domain.Orders;
import teki.clean.app.domain.Schedules;
import teki.clean.app.domain.Users;


/**Realizuje wszelk� funkcjonalno�� sprz�tacza
 * @author Jacek
 *
 */
public class CleanerManager {
	
	/**
	 * Aktualny sprz�tacz
	 */
	private Cleaners cleaner;
	/**
	 * Dane osobowe aktualnego sprz�tacza
	 */
	private Users user;
	
	private ArrayList<Cleaners> cleaners;
	
	/**
	 * Oferty wystawione przez sprz�tacza
	 */
	private ArrayList<Offers> offers;
	
	public CleanerManager(Users user){
		this.user = user;
		this.cleaners = new ArrayList<Cleaners>();
		this.offers = new ArrayList<Offers>();
		//Ustawienie sprz�tacza
		for( Cleaners cls : cleaners ){
			if( cls.getUsers().getUserId() == user.getUserId() ){
				cleaner = cls;
				break;
			}
		}
	}

	/**
	 * @return lista opinii na temat sprz�tacza
	 */
	public ArrayList<Opinions> getOpinions(){
		return cleaner.getOpinionses();
	}
	
	/**
	 * @param offer - oferta z listy ofert sprz�tacza
	 * @return recenzje wystawionej oferty
	 */
	public ArrayList<Opinions> getOfferOpinions( Offers offer ){
		return offer.getOpinionses();
	}
	
	//TODO
	public ArrayList<Offers> getOffers(){
		return offers;
	}
	
	public Offers getOffer( Integer offerId ){
		return findOffer( offerId );
	}
	
	public void addOffer( Offers offer ){
		//Operacje wstawiania oferty do bazy danych
		offers.add(offer);
	}
	
	public void setOffer( Integer offerId ){
		
	}
	
	/**
	 * @return lista wszystkich zatwierdzonych, niezrealizowanych zam�wie� sprz�tacza
	 */
	public ArrayList<Orders> getAllOrders(){
		ArrayList<Orders> orderList = new ArrayList<Orders>();
		
		for( Offers offer_ : getOffers() ){
			for ( Orders order_ : offer_.getOrderses() ){
				if( order_.getState() == 1 )
					orderList.add( order_ );
			}
		}
		return orderList;
	}
	
	/**
	 * @param offerId - id wystawionej oferty
	 * @return orders - zam�wienia us�ug sprz�tacza
	 */
	public ArrayList<Orders> getOrders( Integer offerId ){

		ArrayList<Orders> orders_ = null;
		Offers offer_  = findOffer( offerId );
		if( offer_ != null ){
			orders_ = offer_.getOrderses();
		}
		return orders_;
	}
	
	/**
	 * @return lista niezatwierdzonych zam�wie�
	 */
	public ArrayList<Orders> getWaitingOrders(){
		ArrayList<Orders> waitingOrders = new ArrayList();
		
		for( Offers off : offers ){
			
			for( Orders ord : off.getOrderses() ){	
				if(ord.getState() == 0){
					waitingOrders.add(ord);
				}
			}
			
		}
		return waitingOrders;
	}

	public void sendNotification(){
		
	}
	
	public void addSchedule( ArrayList<Schedules> schedules ){
		cleaner.setScheduleses( schedules );
	}
	
	/*public void modifySchedule(){
		ArrayList<Schedules> schedules = cleaner.getScheduleses();
		if ( schedules != null ){
			
		}
	}*/
	
	/**
	 * @return lista tworz�ca grafik sprz�tacza
	 */
	public ArrayList<Schedules> getSchedules(){
		return cleaner.getScheduleses();
	}
	
	public void setSchedules( ArrayList<Schedules> schedule ){
		cleaner.setScheduleses( schedule );
	}
	
	private Offers findOffer( Integer offerId ){
		Offers desiredOffer = null;
		for( Offers off : offers ){
			if( off.getOfferId() == offerId ){
				desiredOffer = off;
				break;
			}
		}
		return desiredOffer;
	}

}
