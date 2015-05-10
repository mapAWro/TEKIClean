package teki.clean.app.service;

import java.util.ArrayList;

import teki.clean.app.domain.Cleaners;
import teki.clean.app.domain.Offers;
import teki.clean.app.domain.Orders;
import teki.clean.app.domain.Schedules;
import teki.clean.app.domain.Users;


/**
 * @author Jacek
 *Realizuje wszelk± funkcjonalno¶æ sprz±tacza
 */
public class CleanerManager {
	
	/**
	 * Aktualny sprz±tacz
	 */
	private Cleaners cleaner;
	/**
	 * Dane osobowe aktualnego sprz±tacza
	 */
	private Users user;
	
	private ArrayList<Cleaners> cleaners;
	
	/**
	 * Oferty wystawione przez sprz±tacza
	 */
	private ArrayList<Offers> offers;
	
	public CleanerManager(Users user){
		this.user = user;
		this.cleaners = new ArrayList<Cleaners>();
		this.offers = new ArrayList<Offers>();
		//Ustawienie sprz±tacza
		for( Cleaners cls : cleaners ){
			if( cls.getUsers().getUserId() == user.getUserId() ){
				cleaner = cls;
				break;
			}
		}
	}
	
	//TODO
	public ArrayList<Offers> getOffers(){
		return offers;
	}
	
	public void addOffer( Offers offer ){
		//Operacje wstawiania oferty do bazy danych
		offers.add(offer);
	}
	
	public void modifyOffer(){
		
	}
	
	/**
	 * @param offerId - id wystawionej oferty
	 * @return orders - zamówienia us³ug sprz±tacza
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
	 * @return lista niezatwierdzonych zamówieñ
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
	
	public void addSchedule(){
		
	}
	
	public void modifySchedule(){
		
	}
	
	/**
	 * @return lista tworz±ca grafik sprz±tacza
	 */
	public ArrayList<Schedules> getSchedule(){
		return cleaner.getScheduleses();
	}
	
	private Offers findOffer( Integer offerId ){
		Offers desiredOffer = null;
		for( Offers off : offers ){
			if( off.getOfferId() == offerId){
				desiredOffer = off;
				break;
			}
		}
		return desiredOffer;
	}
	
}
