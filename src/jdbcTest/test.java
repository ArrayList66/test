package jdbcTest;

import java.util.Calendar;



public class test {
	private int id;
	private String address;
	private String date;
	private String name;
	public test(){
		
		
	}
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setDate(String date)
	{
		this.date=date;
	}
	public String getAddress()
	{
		return address;
	}
	
	public String getdate()
	{
		String nowtimes;
		Calendar c=Calendar.getInstance();
		nowtimes=Integer.toString(c.get(Calendar.YEAR))+"-"
       +Integer.toString(c.get(Calendar.MONTH) + 1 )+"-"+Integer.toString(
        c.get(Calendar.DAY_OF_MONTH));
		date=nowtimes;
        return date;
	}
		
		
}
