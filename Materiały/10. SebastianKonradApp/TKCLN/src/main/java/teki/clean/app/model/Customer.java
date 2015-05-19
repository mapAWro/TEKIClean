package teki.clean.app.model;

public class Customer {
	private int customer_id;
	private int user_id;
	private int dorm_num;
	private int room;
	private String dorm_addres;

	public int getCustomer_id() 					{return customer_id;}
	public void setCustomer_id(int customer_id) 	{this.customer_id = customer_id;}
	
	public int getUser_id() 						{return user_id;}
	public void setUser_id(int user_id) 			{this.user_id = user_id;}
	
	public int getDorm_num() 						{return dorm_num;}
	public void setDorm_num(int dorm_num) 			{this.dorm_num = dorm_num;}
	
	public int getRoom() 							{return room;}
	public void setRoom(int room) 					{this.room = room;}	
	
	public String getDorm_addres() 					{return dorm_addres;}
	public void setDorm_addres(String dorm_addres)	{this.dorm_addres = dorm_addres;}

}
