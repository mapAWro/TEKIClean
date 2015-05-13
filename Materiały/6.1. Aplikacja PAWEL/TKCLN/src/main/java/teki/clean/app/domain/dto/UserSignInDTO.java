package teki.clean.app.domain.dto;

import teki.clean.app.domain.Customers;
import teki.clean.app.domain.Users;

public class UserSignInDTO {
	private Users user = new Users();
	private Customers customer = new Customers();

	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	public String getName() {
		return user.getName();
	}
	public void setName(String name) {
		user.setName(name);
	}
	public String getLastName() {
		return user.getLastName();
	}
	public void setLastName(String lastName) {
		user.setLastName(lastName);
	}
	public boolean isSex() {
		return user.isSex();
	}
	public void setSex(boolean sex) {
		user.setSex(sex);
	}
	public String getLogin() {
		return user.getLogin();
	}
	public void setLogin(String login) {
		user.setLogin(login);
	}
	public String getPassword() {
		return user.getPassword();
	}
	public void setPassword(String password) {
		user.setPassword(password);
	}
	public String getEmail() {
		return user.getEmail();
	}
	public void setEmail(String email) {
		user.setEmail(email);
	}
	public Integer getDormNum() {
		return customer.getDormNum();
	}
	public void setDormNum(Integer dormNum) {
		customer.setDormNum(dormNum);
	}
	public Integer getRoom() {
		return customer.getRoom();
	}
	public void setRoom(Integer room) {
		customer.setRoom(room);
	}
	public String getDormAddres() {
		return customer.getDormAddres();
	}
	public void setDormAddres(String dormAddres) {
		customer.setDormAddres(dormAddres);
	}
}
