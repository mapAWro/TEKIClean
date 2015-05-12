package teki.clean.app.service;

import java.util.ArrayList;

import teki.clean.app.domain.Cleaners;
import teki.clean.app.domain.Customers;
import teki.clean.app.domain.Offers;
import teki.clean.app.domain.Opinions;
import teki.clean.app.domain.Orders;
import teki.clean.app.domain.Users;


/**Realizuje wszelkie funkcjonalno¶ci klienta.
 * @author Jacek
 * 
 */
public class CustomerManager {
	
	private Customers customer;
	private Users user;
	
	private ArrayList<Customers> customers;
	
	public ArrayList<Offers> getOffers(){
		ArrayList<Orders> orders = getOrders();
		ArrayList<Offers> offers = new ArrayList<Offers>();
		
		for( Orders ord : orders ){
			offers.add( ord.getOffers() );
		}
		
		return offers;
	}
	
	public CustomerManager(Users user){
		this.user = user;
		this.customers = new ArrayList<Customers>();
		/*Ustawienie klienta*/
		for( Customers cst : customers ){
			if( cst.getUsers().getUserId() == user.getUserId() ){
				customer = cst;
				break;
			}
		}
	}
	
	public boolean makeOrder( Orders order, Integer offerId ){
		/*Zamówienie dopiero co z³o¿one*/
		order.setState(0);
		order.setCustomers(customer);
		Offers offer_ = findOffer(offerId);
		order.setOffers( offer_ );
		/*Dodanie obiektu do bazy danych*/
		offer_.getOrderses().add(order);
		return true;
	}
	
	public void modifyOrder(){
		
	}
	
	public void deleteOrder(){
		
	}
	
	public ArrayList<Orders> getOrders(){
		return customer.getOrderses();
	}
	
	public boolean rateOrder( Integer orderId, Opinions opinion ){
		Orders order = findOrder(orderId);
		/*Po³±czenie z odpowiedni± ofert±*/
		opinion.setOffers(order.getOffers());
		/*Do poprawy!!!
		 * Mo¿liwe, ¿e trzeba bêdzie dodaæ funkcjê w obiekcie offer, by ta aktualizowa³a bazê*/		
		order.getOffers().getOpinionses().add(opinion);
		return true;
	}
	
	public boolean rateCleaner( Integer orderId, Opinions opinion ){
		Orders order = findOrder(orderId);
		/*Po³±czenie z odpowiednim sprz±taczem*/
		opinion.setCleaners(order.getOffers().getCleaners());
		/*Jeszcze gorzej ni¿ wy¿ej!!!*/
		order.getOffers().getCleaners().getOpinionses().add(opinion);
		return true;
	}
	
	private Orders findOrder( Integer orderId ){
		Orders desiredOrder = null;
		for( Orders ord : getOrders() ){
			if( ord.getOrderId() == orderId ){
				desiredOrder = ord;
				break;
			}
		}
		return desiredOrder;
	}
	
	private Offers findOffer( Integer offerId ){
		Offers desiredOffer = null;
		/*Pobranie ofert z bazy danych*/
		ArrayList<Offers> offers = new ArrayList<Offers>();
		for( Offers off : offers ){
			if( off.getOfferId() == offerId ){
				desiredOffer = off;
				break;
			}
		}
		return desiredOffer;
	}
}
