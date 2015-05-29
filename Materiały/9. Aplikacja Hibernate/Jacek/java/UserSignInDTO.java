package teki.clean.app.domain.dto;

import teki.clean.app.model.Customer;
import teki.clean.app.model.User;

public class UserSignInDTO {
	private User user = new User();
	private Customer customer = new Customer();

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getName() {
		return user.getName();
	}
	public void setName(String name) {
		user.setName(name);
	}
	public String getLastName() {
		return user.getLast_name();
	}
	public void setLastName(String lastName) {
		user.setLast_name(lastName);
	}
/*	public boolean isSex() {
		return user.getSex();
	}*/
/*	public void setSex(boolean sex) {
		user.setSex(sex);
	}*/
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
		return customer.getDorm_num();
	}
	public void setDormNum(Integer dormNum) {
		customer.setDorm_num(dormNum);
	}
	public Integer getRoom() {
		return customer.getRoom();
	}
	public void setRoom(Integer room) {
		customer.setRoom(room);
	}
	public String getDormAddres() {
		return customer.getDorm_addres();
	}
	public void setDormAddres(String dormAddres) {
		customer.setDorm_addres(dormAddres);
	}
}
