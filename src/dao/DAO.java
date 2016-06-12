package dao;

import java.util.List;

import jdbcTest.User;
import jdbcTest.test;

public interface DAO {
	public boolean insert(test test) throws Exception;
	public boolean updateID() throws Exception;
	public boolean update(test test) throws Exception;	
	public boolean delete(String name) throws Exception;
	public List<test> query() throws Exception;
	public test queryById(int id) throws Exception;
	public Boolean login(User user)throws Exception;
}
