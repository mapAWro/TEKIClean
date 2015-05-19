package teki.clean.app.model;

public class Cleaner_res {
	private int cleaner_res_id;
	private int resource_id;
	private int cleaner_id;
	private int quantity;
	private int state;

	public int getCleaner_res_id() 						{return cleaner_res_id;}
	public void setCleaner_res_id(int cleaner_res_id) 	{this.cleaner_res_id = cleaner_res_id;}
	
	public int getResource_id() 						{return resource_id;}
	public void setResource_id(int resource_id) 		{this.resource_id = resource_id;}

	public int getCleaner_id() 							{return cleaner_id;}
	public void setCleaner_id(int cleaner_id) 			{this.cleaner_id = cleaner_id;}
	
	public int getQuantity() 							{return quantity;}
	public void setQuantity(int quantity) 				{this.quantity = quantity;}

	public int getState() 								{return state;}
	public void setState(int state) 					{this.state = state;}
}
