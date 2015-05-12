package teki.clean.app.domain;

// Generated 2015-05-06 23:07:10 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Set;

/**
 * Customers generated by hbm2java
 */
public class Customers implements java.io.Serializable {

	private Integer customerId;
	private Users users;
	private Integer dormNum;
	private Integer room;
	private String dormAddres;
	private ArrayList<Orders> orderses = new ArrayList<Orders>();

	public Customers() {
	}

	public Customers(Users users) {
		this.users = users;
	}

	public Customers(Users users, Integer dormNum, Integer room,
			String dormAddres, ArrayList<Orders> orderses) {
		this.users = users;
		this.dormNum = dormNum;
		this.room = room;
		this.dormAddres = dormAddres;
		this.orderses = orderses;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Integer getDormNum() {
		return this.dormNum;
	}

	public void setDormNum(Integer dormNum) {
		this.dormNum = dormNum;
	}

	public Integer getRoom() {
		return this.room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public String getDormAddres() {
		return this.dormAddres;
	}

	public void setDormAddres(String dormAddres) {
		this.dormAddres = dormAddres;
	}

	public ArrayList<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(ArrayList<Orders> orderses) {
		this.orderses = orderses;
	}

}
