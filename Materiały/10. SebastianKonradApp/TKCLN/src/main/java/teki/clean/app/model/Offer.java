package teki.clean.app.model;

public class Offer {
	private int	offer_id;
	private int cleaner_id;
	private byte [] offer_type;
	private String descr;
	private  boolean scheduled; // Co to jest?
	private String day;
	private String time;


	public int getOffer_id() 						{return offer_id;}
	public void setOffer_id(int offer_id) 			{this.offer_id = offer_id;}
	
	public int getCleaner_id() 						{return cleaner_id;}						
	public void setCleaner_id(int cleaner_id) 			{this.cleaner_id = cleaner_id;}
	
	public byte [] getOffer_type() 					{return offer_type;}
	public void setOffer_type(byte [] offer_type) 	{this.offer_type = offer_type;}
	
	public String getDescr() 						{return descr;}
	public void setDescr(String descr) 				{this.descr = descr;}

	public boolean getScheduled() 					{return scheduled;}
	public void setScheduled(boolean scheduled) 	{this.scheduled = scheduled;}
	
	public String getDay() 							{return day;}
	public void setDay(String day)					{this.day = day;}
	
	public String getTime() 						{return time;}						
	public void setTime(String time) 				{this.time = time;}

}
