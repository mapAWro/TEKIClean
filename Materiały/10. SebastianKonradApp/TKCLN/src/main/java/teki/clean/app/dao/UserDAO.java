package teki.clean.app.dao;

import java.util.List;
import teki.clean.app.model.User;

public interface UserDAO {
	public List<User> list();
	public User get(int user_id);
	public void saveOrUpdate(User user);
	public void delete(int user_id);
	
	//Potrzebne do logowania - Dokoñcz!
	//public boolean logIn(String login, String password);
	//public int getAuthLvl();
	//public boolean checkPassword( String userPassword, String Password);
}
