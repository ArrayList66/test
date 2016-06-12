package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection(){

		
	    //Connection conn;
	
		String driver = "com.mysql.jdbc.Driver";

		  
	    String url = "jdbc:mysql://127.0.0.1:3306/test";

	    // MySQL����ʱ���û���
	    String user = "root"; 

	    // MySQL����ʱ������
	    String password = "root";

	    try { 
	     // ������������
	     Class.forName(driver);

	     // �������ݿ�
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
