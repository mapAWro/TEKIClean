package teki.clean.app.service;

import java.util.ArrayList;

import teki.clean.app.domain.User;
import teki.clean.app.domain.Users;

/**
 * @author Jacek
 *Zarz¹dza u¿ytkownikami w systemie
 */
public class UserManager {
	
	public UserManager(){
		this.setUsers( new ArrayList<Users>() );
	}
	
	private ArrayList<Users> users;

	public ArrayList<Users> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<Users> users) {
		this.users = users;
	}
	
	public void addUser(Users user){
		users.add(user);
	}
	
	public void modifyUser(Users user){
		
		if( users != null ){
			for( Users u : users ){
				if( u.getUserId() == user.getUserId() )
					u = user;
			}
		}	
		
	}
}
