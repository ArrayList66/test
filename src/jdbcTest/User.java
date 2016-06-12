package jdbcTest;

public class User {
	private int id;
	private String passward;
	private String username;
	public User(){
		
		
	}
	public String getName()
	{
		return username;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String username)
	{
		this.username=username;
	}
	public String getpassward()
	{
		return passward;
	}
	
	
	public void setpassward(String passward)
	{
		this.passward=passward;
	}
	
}
