package teki.clean.app.model;

public class Opinion {
	private int opinion_id;
	private int offer_id;
	private int cleaner_id;
	private String text;
	private int rate;

	public int getOpinion_id() 					{return opinion_id;}
	public void setOpinion_id(int opinion_id) 	{this.opinion_id = opinion_id;}
	
	public int getOffer_id() 					{return offer_id;}			
	public void setOffer_id(int offer_id) 		{this.offer_id = offer_id;}
	
	public int getCleaner_id() 					{return cleaner_id;}
	public void setCleaner_id(int cleaner_id) 	{this.cleaner_id = cleaner_id;}
	
	public String getText() 					{return text;}
	public void setText(String text) 			{this.text = text;}

	public int getRate() 						{return rate;}
	public void setRate(int rate) 				{this.rate = rate;}
}
