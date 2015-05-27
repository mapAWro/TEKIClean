package teki.clean.app.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import teki.clean.app.dao.CleanerDAO;
import teki.clean.app.dao.CustomerDAO;
import teki.clean.app.dao.UserDAO;
import teki.clean.app.model.Cleaner;
import teki.clean.app.model.Customer;
import teki.clean.app.model.Offer;
import teki.clean.app.model.Schedule;
import teki.clean.app.model.User;

/**
 * @author Jacek
 *Zarz±dza u¿ytkownikami w systemie
 */
//@Component
//@Scope("session")
public class UserManager implements Serializable{


	/**
	 * Bie¿±cy u¿ytkownik
	 */
	private User user;
	
	/**
	 * Lista u¿ytkowników pobrana z bazy danych
	 */
	private List<User> users;
	
	private UserDAO userDAO;
	private CleanerDAO cleanerDAO;
	private CustomerDAO customerDAO;
		
	public UserManager(UserDAO userDAO, CleanerDAO cleanerDAO, CustomerDAO customerDAO){
		this.userDAO = userDAO;
		this.cleanerDAO = cleanerDAO;
		this.customerDAO = customerDAO;
		this.users = userDAO.list();
	}
	
	/**Tworzy nowego u¿ytkownika w bazie
	 * @param user - obiekt utworzony przez kontroler
	 * @return true - je¶li obiekt da³o siê utworzyæ pomy¶lnie
	 */
	public boolean signInCustomer(User user, Customer customer){
		boolean state = false;
		
		user.setAuth_lvl(2);
		userDAO.saveOrUpdate( user );
		customer.setUser_id( user.getUser_id() );
		customerDAO.saveOrUpdate(customer);
		
		state = true;
		return state;
	}
	
	public boolean signInCleaner(User user){
		boolean state = false;
		
		//Operacja wstawiania nowego u¿ytkownika do bazy		
		user.setAuth_lvl(1);		
		userDAO.saveOrUpdate( user );
		
		Cleaner cleaner = new Cleaner();
		cleaner.setUser_id( user.getUser_id() );		
		cleanerDAO.saveOrUpdate( cleaner );
		
		ArrayList<Schedule> sch = new 	ArrayList<Schedule>();
		
		Schedule schedule;
		for(int i = 0; i < 7; i++){
			schedule = new Schedule();
			schedule.setDay(i);
			schedule.setCleaner_id( cleaner.getCleaner_id() );
			sch.add(schedule);
		}
		
		//cleaner.setScheduleses(sch);
		//user.setCleaneres(cleaner);
		//sprawdzenie, czy u¿ytkownik zosta³ wstawiony - walidacja
		state = true;
		return state;
	}
	
	public boolean logIn(String login, String password){
		boolean state = false;
		User user_ = findUser( login );
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
	public User findUser( String login ){
		users = userDAO.list();
		User desiredUser = null;
		for( User user : users ){
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
			return user.getAuth_lvl();
		else return -1;
	}
	
	//Gettery i settery
	
	public List<User> getUsers() {
		return this.users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public void modifyUser(User user){	
		
	}
	
	public ArrayList<Offer> getAllOffer(){
		//Pobranie ofert z bazy danych
		ArrayList<Offer> offer = new ArrayList<Offer>();
		
		return offer;
	}

	public Offer getOfferDetails( Integer offerId){
		//Pobranie ofert z bazy danych
		ArrayList<Offer> offers_ = new ArrayList<Offer>();
		
		
		return findOffer( offerId, offers_ );
	}
	
	private Offer findOffer( Integer offerId, ArrayList<Offer> Offer ){
		Offer desiredOffer = null;
		for( Offer off : Offer ){
			if( off.getOffer_id() == offerId ){
				desiredOffer = off;
				break;
			}
		}
		return desiredOffer;
	}
	
	public void add( User user ){
		users.add(user);
	}
}
