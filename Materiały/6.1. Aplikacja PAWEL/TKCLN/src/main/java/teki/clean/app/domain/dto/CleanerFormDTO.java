package teki.clean.app.domain.dto;

import java.util.ArrayList;

import teki.clean.app.domain.CleanerRes;
import teki.clean.app.domain.Offers;
import teki.clean.app.domain.Opinions;
import teki.clean.app.domain.Orders;
import teki.clean.app.domain.Schedules;
import teki.clean.app.domain.Users;
import teki.clean.app.service.CleanerManager;
import teki.clean.app.service.UserManager;

/**Obiekt trasferowy dla wy¶wietlania danych w g³ównym panelu sprz±tacza.
 * @author Jacek
 * 
 */
public class CleanerFormDTO {
	/*Cleaner data*/
	private String name;
	private String lastName;
	private String login;
	private String email;
	private Integer phoneNum;
	
	private ArrayList<Schedules> scheduleses = new ArrayList<Schedules>();
	private ArrayList<Opinions> opinionses = new ArrayList<Opinions>();
	private ArrayList<CleanerRes> cleanerReses = new ArrayList<CleanerRes>();
	private ArrayList<Offers> offerses = new ArrayList<Offers>();
	private ArrayList<Orders> orders = new ArrayList<Orders>();
	private ArrayList<Orders> waitingOrders = new ArrayList<Orders>();
	
	public void setData( CleanerManager cm, Users user ){
		setName( user.getName() );
		setLastName( user.getLastName() );
		setLogin( user.getLogin() );
		setEmail( user.getEmail() );
		setPhoneNum( user.getPhoneNum() );
		setScheduleses( cm.getSchedules() );
		setOpinionses( cm.getOpinions() );
		setOfferses( cm.getOffers() );
		setOrders( cm.getAllOrders() );
		setWaitingOrders( cm.getWaitingOrders() );
	}
	
	/*Gettery i Settery*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Integer phoneNum) {
		this.phoneNum = phoneNum;
	}
	public ArrayList<Schedules> getScheduleses() {
		return scheduleses;
	}
	public void setScheduleses(ArrayList<Schedules> scheduleses) {
		this.scheduleses = scheduleses;
	}
	public ArrayList<Opinions> getOpinionses() {
		return opinionses;
	}
	public void setOpinionses(ArrayList<Opinions> opinionses) {
		this.opinionses = opinionses;
	}
	public ArrayList<CleanerRes> getCleanerReses() {
		return cleanerReses;
	}
	public void setCleanerReses(ArrayList<CleanerRes> cleanerReses) {
		this.cleanerReses = cleanerReses;
	}
	public ArrayList<Offers> getOfferses() {
		return offerses;
	}
	public void setOfferses(ArrayList<Offers> offerses) {
		this.offerses = offerses;
	}
	public ArrayList<Orders> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<Orders> orders) {
		this.orders = orders;
	}
	public ArrayList<Orders> getWaitingOrders() {
		return waitingOrders;
	}
	public void setWaitingOrders(ArrayList<Orders> waitingOrders) {
		this.waitingOrders = waitingOrders;
	}
	
}
