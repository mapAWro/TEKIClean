package teki.clean.app.model;

public class Resource {
	private int resource_id;
	private String name;
	private int quantity;
	private String descr;

	public int getResource_id() 				{return resource_id;}
	public void setResource_id(int resource_id) {this.resource_id = resource_id;}
	
	public String getName() 					{return name;}
	public void setName(String name) 			{this.name = name;}
	
	public int getQuantity() 					{return quantity;}
	public void setQuantity(int quantity) 		{this.quantity = quantity;}
	
	public String getDescr() 					{return descr;}
	public void setDescr(String descr) 			{this.descr = descr;}

}
