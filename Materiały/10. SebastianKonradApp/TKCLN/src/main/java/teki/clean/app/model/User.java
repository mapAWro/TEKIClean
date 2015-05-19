package teki.clean.app.model;

public class User {
	private int	user_id;
	private String name;
	private String last_name;
	private byte sex;
	private String login;
	private String password;
	private String email;
	private int	phone_num;
	private int	auth_lvl;
	private String locality;
	private String street_addr;
	private String postal_code;
	private String post_loc;

	public int getUser_id() 						{return user_id;}
	public void setUser_id(int user_id) 			{this.user_id = user_id;}
	
	public String getName() 						{return name;}						
	public void setName(String name) 				{this.name = name;}
	
	public String getLast_name() 					{return last_name;}
	public void setLast_name(String last_name) 		{this.last_name = last_name;}
	
	public byte getSex() 							{return sex;}
	public void setSex(byte sex) 					{this.sex = sex;}

	public String getLogin() 						{return login;}
	public void setLogin(String login) 				{this.login = login;}
	
	public String getPassword() 					{return password;}
	public void setPassword(String password)		{this.password = password;}
	
	public String getEmail() 						{return email;}						
	public void setEmail(String email) 				{this.email = email;}
	
	public int getPhone_num() 						{return phone_num;}
	public void setPhone_num(int phone_num) 		{this.phone_num = phone_num;}
	
	public int getAuth_lvl() 						{return auth_lvl;}
	public void setAuth_lvl(int auth_lvl) 			{this.auth_lvl = auth_lvl;}
	
	public String getLocality() 					{return locality;}
	public void setLocality(String locality) 		{this.locality = locality;}
	
	public String getStreet_addr() 					{return street_addr;}						
	public void setStreet_addr(String street_addr) 	{this.street_addr = street_addr;}
	
	public String getPostal_code() 					{return postal_code;}
	public void setPostal_code(String postal_code) 	{this.postal_code = postal_code;}
	
	public String getPost_loc() 					{return post_loc;}
	public void setPost_loc(String post_loc) 		{this.post_loc = post_loc;}
}
