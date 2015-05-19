package teki.clean.app.model;

public class Order {
	private int order_id;
	private int customer_id;
	private int offers_offer_id;
	private java.sql.Date term;
	private int state;
	
	public int getOrder_id() 								{return order_id;}
	public void setOrder_id(int order_id) 					{this.order_id = order_id;}
	
	public int getCustomer_id() 							{return customer_id;}
	public void setCustomer_id(int customer_id) 			{this.customer_id = customer_id;}
	
	public int getOffers_offer_id() 						{return offers_offer_id;}
	public void setOffers_offer_id(int offers_offer_id) 	{this.offers_offer_id = offers_offer_id;}
	
	public java.sql.Date getTerm() 							{return term;}
	public void setTerm(java.sql.Date term) 				{this.term = term;}
	
	public int getState() 									{return state;}
	public void setState(int state) 						{this.state = state;}	
}
