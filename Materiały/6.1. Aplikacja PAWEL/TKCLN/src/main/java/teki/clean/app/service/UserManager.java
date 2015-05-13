package teki.clean.app.service;

import java.util.ArrayList;

import teki.clean.app.domain.Cleaners;
import teki.clean.app.domain.Customers;
import teki.clean.app.domain.Offers;
import teki.clean.app.domain.Users;

/**
 * @author Jacek
 *Zarz±dza u¿ytkownikami w systemie
 */
public class UserManager {
	
	/**
	 * Bie¿±cy u¿ytkownik
	 */
	private Users user;
	
	/**
	 * Lista u¿ytkowników pobrana z bazy danych
	 */
	private ArrayList<Users> users;
	
	public UserManager(){
		//Operacja pobrania listy u¿ytkowników z bazy danych
		this.setUsers( new ArrayList<Users>() );
	}
	
	/**Tworzy nowego u¿ytkownika w bazie
	 * @param user - obiekt utworzony przez kontroler
	 * @return true - je¶li obiekt da³o siê utworzyæ pomy¶lnie
	 */
	public boolean signInCustomer(Users user, Customers customer){
		boolean state = false;
		
		//Operacja wstawiania nowego u¿ytkownika do bazy
		user.setCustomerses(customer);
		user.setAuthLvl(2);
		users.add(user);
		//sprawdzenie, czy u¿ytkownik zosta³ wstawiony - walidacja
		state = true;
		return state;
	}
	
	public boolean signInCleaner(Users user){
		boolean state = false;
		
		//Operacja wstawiania nowego u¿ytkownika do bazy
		Cleaners cleaner = new Cleaners();
		cleaner.setUsers(user);
		user.setCleanerses(cleaner);
		user.setAuthLvl(1);
		users.add(user);
		//sprawdzenie, czy u¿ytkownik zosta³ wstawiony - walidacja
		state = true;
		return state;
	}
	
	public boolean logIn(String login, String password){
		boolean state = false;
		Users user_ = findUser( login );
		if ( user_ != null ){
			if ( checkPassword(password, user_.getPassword() ) ){
				user = user_;
				state = true;
			}
		}
		return state;
	}
	
	public void logOut(){
		user = null;
	}
	
	/**
	 * Szuka u¿ytkownika na podstawie loginu
	 * @param login - login u¿ytkownika
	 * @return user - u¿ytkownik spe³niaj±cy podany parametr 
	 */
	public Users findUser( String login ){
		Users desiredUser = null;
		for( Users user : users ){
			if( user.getLogin().equals(login) ){
				desiredUser = user;
				break;
			}
		}
		
		return desiredUser;
	}
	
	/** Sprawdza zgodno¶æ hase³
	 * @param userPassword - has³o podane przez u¿ytkownika
	 * @param Password - has³o przechowywane w bazie
	 * @return
	 */
	private boolean checkPassword( String userPassword, String Password){
		//hash calculation
		String hash = userPassword;
		if ( userPassword.equals(Password) )
			return true;
		else
			return false;
	}

	public String getUserLogin(){
		
		String login = "";
		
		if( user != null ){
			login = user.getLogin();
		}
		
		return login;
	}
	
	public int getAuthLvl(){
		if( user != null )
			return user.getAuthLvl();
		else return -1;
	}
	
	/*Gettery i settery*/
	
	public ArrayList<Users> getUsers() {
		return users;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public void setUsers(ArrayList<Users> users) {
		this.users = users;
	}
	
	/*Do wywalenia*/
	public void addUser(Users user){
		users.add(user);
	}
	
	//TODO
	public void modifyUser(Users user){	
		
	}
	
	public ArrayList<Offers> getAllOffers(){
		//Pobranie ofert z bazy danych
		return new ArrayList<Offers>();
	}
	
	public Offers getOfferDetails( Integer offerId){
		//Pobranie ofert z bazy danych
		ArrayList<Offers> offers_ = new ArrayList<Offers>();
		
		
		return findOffer( offerId, offers_ );
	}
	
	private Offers findOffer( Integer offerId, ArrayList<Offers> offers ){
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
