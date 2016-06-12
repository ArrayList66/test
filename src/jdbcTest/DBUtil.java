package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection(){

		
	    //Connection conn;
	
		String driver = "com.mysql.jdbc.Driver";

		  
	    String url = "jdbc:mysql://127.0.0.1:3306/test";

	    // MySQL配置时的用户名
	    String user = "root"; 

	    // MySQL配置时的密码
	    String password = "root";

	    try { 
	     // 加载驱动程序
	     Class.forName(driver);

	     // 连续数据库
	     Connection conn = DriverManager.getConnection(url, user, password);

	     if(!conn.isClosed()) 
	      System.out.println("Succeeded connecting to the Database!");
	      return conn;
		
	    	}catch(ClassNotFoundException e) {


	     System.out.println("Sorry,can`t find the Driver!"); 
	     e.printStackTrace();

	    
	    } catch(SQLException e) {


	     e.printStackTrace();


	    } catch(Exception e) {


	     e.printStackTrace();


	    }
		return null;
	   
			}

	

}
