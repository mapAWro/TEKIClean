package teki.clean.app.model;

public class Schedule {
	private int schedule_id;
	private int cleaner_id;
	private int day;
	private String time_range;

	public int getSchedule_id() 					{return schedule_id;}
	public void setSchedule_id(int schedule_id) 	{this.schedule_id = schedule_id;}
	
	public int getCleaner_id() 						{return cleaner_id;}
	public void setCleaner_id(int cleaner_id) 		{this.cleaner_id = cleaner_id;}

	public int getDay() 							{return day;}
	public void setDay(int day) 					{this.day = day;}

	public String getTime_range() 					{return time_range;}
	public void setTime_range(String time_range) 	{this.time_range = time_range;}
}
