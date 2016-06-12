package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.DAO;  
import jdbcTest.DBUtil;
import jdbcTest.User;
import jdbcTest.test;


public class DaoImpl implements DAO{
	
	
	
	@Override
	public boolean insert(test test) throws Exception{
		PreparedStatement pstmt;
		
		Connection conn=null; 
		
	    
	    String sqlinsert="INSERT INTO teacher(name, year) VALUES (?,?)";
	   try{
		   conn= DBUtil.getConnection();
	    pstmt = (PreparedStatement) conn.prepareStatement(sqlinsert);
	    
	    pstmt.setString(1,test.getName());
	    pstmt.setString(2,test.getdate());
	  
	    if(pstmt.executeUpdate()>0){
	    	return true;
	    	
	    }
	    
	    
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		   
		   conn.close();
	   }
	return false;
}	
	
	@Override
	public boolean update(test test) throws Exception{
		PreparedStatement pstmt;
	    Connection conn = DBUtil.getConnection();
	    String sqlupdate="update teacher set id=?,name=?,address=?,date=?";
	    try{
			   conn= DBUtil.getConnection();
			   pstmt = (PreparedStatement) conn.prepareStatement(sqlupdate);
			   pstmt.setInt(1,test.getId());
			   pstmt.setString(2,test.getName());
			   pstmt.setString(3, test.getAddress());
			   pstmt.setString(4, test.getdate());
		    if(pstmt.executeUpdate()>0){
		    	return true;
		    	
		    }
		    
		    
		   }catch(Exception e){
			   e.printStackTrace();
		   }finally{
			   
			   conn.close();
		   }
		return false;
		
	}
	@Override
	public boolean updateID() throws Exception{
		PreparedStatement pstmt;
	    Connection conn = DBUtil.getConnection();
	    String sqlalter1="alter table teacher drop COLUMN id";
	    String sqlalter2="alter table teacher add id mediumint(8) not null primary key auto_increment first";
	    try{
			   conn= DBUtil.getConnection();
			   pstmt = (PreparedStatement) conn.prepareStatement(sqlalter1);
			   pstmt.executeUpdate();
			   conn= DBUtil.getConnection();
			   pstmt = (PreparedStatement) conn.prepareStatement(sqlalter2);
			   pstmt.executeUpdate();
		   }catch(Exception e){
			   e.printStackTrace();
		   }finally{
			   
			   conn.close();
		   }
		return false; 
		
	    
	    
	    
	
	}
	
	@Override
	public boolean delete(String name) throws Exception{
		PreparedStatement pstmt;	
		Connection conn=null; 
		String sqldelete=" delete from teacher where name='" + name + "'";
	   try{
		   conn= DBUtil.getConnection();
		   pstmt = (PreparedStatement) conn.prepareStatement(sqldelete);

	    if(pstmt.executeUpdate()>0){
	    	return true;
	    	
	    }
	    
	    
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally{
		   
		   conn.close();
	   }
	return false; 
	
	}
	@Override
	public List<test> query() throws Exception{
		 PreparedStatement pstmt;
	     String sqlteacher="select * from teacher";
	     Connection conn=null;
	    List<test> test = new ArrayList<test>();
	   
	    try{
			   conn= DBUtil.getConnection();
			   pstmt = (PreparedStatement) conn.prepareStatement(sqlteacher);
			   ResultSet rs=pstmt.executeQuery();
			   while(rs.next()){
				 test a=new test();
			   a.setId(rs.getInt(1));
			   a.setName(rs.getString(2));
			   a.setAddress(rs.getString(3));
			   a.setDate(rs.getString(4));
			   test.add(a);
			   
			   }
			   
		    if(pstmt.executeUpdate()>0){
		    	return test;
		    	
		    }
		    
		    
		   }catch(Exception e){
			   e.printStackTrace();
		   }finally{
			   
			   conn.close();
		   }
		return null; 
		
		
		
		
		
		
	}
	@Override
	public test queryById(int id) throws Exception{
		
		
		  // statement用来执行SQL语句
	     PreparedStatement pstmt;
	     String sqlteacher="select * from teacher where id=?";
	     Connection conn=null;
	     
	   
	    try{
			   conn= DBUtil.getConnection();
			   pstmt = (PreparedStatement) conn.prepareStatement(sqlteacher);
			   pstmt.setInt(1, id);
			   ResultSet rs=pstmt.executeQuery();
			   test q=new test();
			   q.setId(rs.getInt(1));
			   q.setName(rs.getString(2));
			   q.setAddress(rs.getString(3));
			   q.setDate(rs.getString(4));
			   return q;
			   
		  
		    
		    
		   }catch(Exception e){
			   e.printStackTrace();
		   }finally{
			   
			   conn.close();
		   }
		return null; 
		
		
		
		
	}

	@Override
	public Boolean login(User user) throws Exception {
		
		 // statement用来执行SQL语句
	     PreparedStatement pstmt;
	     String sqlteacher="select * from teacher where username=?";
	     Connection conn=null;
	     
	   
	    try{
			   conn= DBUtil.getConnection();
			   pstmt = (PreparedStatement) conn.prepareStatement(sqlteacher);
			   pstmt.setString(1, user.getName());
			   ResultSet rs=pstmt.executeQuery();
			   if(user.getpassward()==rs.getString(3)){
				   
				   return true;
			   }
			   
			   
		  
		    
		    
		   }catch(Exception e){
			   e.printStackTrace();
		   }finally{
			   
			   conn.close();
		   }
		return false; 
		
	}
	
	
	
}
