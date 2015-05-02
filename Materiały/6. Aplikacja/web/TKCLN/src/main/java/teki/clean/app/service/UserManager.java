package teki.clean.app.service;

import java.util.ArrayList;

import teki.clean.app.domain.User;

public class UserManager {
	private ArrayList<User> users;

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	public void addUser(User user){
		users.add(user);
	}
	
	public void modifyUser(User user){
		
		if( users != null ){
			for( User u : users ){
				if( u.getUserID() == user.getUserID() )
					u = user;
			}
		}	
		
	}
}
