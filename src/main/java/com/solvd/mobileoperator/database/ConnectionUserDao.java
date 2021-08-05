package com.solvd.mobileoperator.database;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class ConnectionUserDao {

//	public void getUser(int id) {
//		
//		Connector conn = new Connector();
//		
//		try {
//			Statement stmt = conn.connect().createStatement();
//			ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE id=" + id);
//
//			if(rs.next())
//			{
//				User user = new User();
//
//				user.setId( rs.getInt("id") );
//				user.setName( rs.getString("name") );
//				user.setPass( rs.getString("pass") );
//				user.setAge( rs.getInt("age") );
//
//				return user;
//			}
//
//	        } catch (SQLException ex) {
//	            ex.printStackTrace();
//	        }
////	    return null;
//	}
//	
//	private User extractUserFromResultSet(ResultSet rs) throws SQLException {
//	    User user = new User();
//
//	    user.setId( rs.getInt("id") );
//	    user.setName( rs.getString("name") );
//	    user.setPass( rs.getString("pass") );
//	    user.setAge( rs.getInt("age") );
//
//	    return user;
//	}
//	
//	public User getUser(int id) {
//	    Connection connection = connectionFactory.getConnection();
//	    try {
//	        Statement stmt = connection.createStatement();
//	        ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE id=" + id);
//
//	        if(rs.next())
//	        {
//	            return extractUserFromResultSet(rs);
//	        }
//
//	    } catch (SQLException ex) {
//	        ex.printStackTrace();
//	    }
//
//	    return null;
//	}
//	
//	
//	public User getUserByUserNameAndPassword(String user, String pass) {
//	    Connector connector = new Connector();
//	    Connection connection = connector.getConnection();
//	    try {
//	        PreparedStatement ps = connection.prepareStatement("SELECT * FROM user WHERE user=? AND pass=?");
//	        ps.setString(1, user);
//	        ps.setString(2, pass);
//	        ResultSet rs = ps.executeQuery();
//
//	        if(rs.next())
//	        {
//	    return extractUserFromResultSet(rs);
//	        }
//
//	    } catch (SQLException ex) {
//	        ex.printStackTrace();
//	    }
//
//	    return null;
//	}
//	
//	public Set getAllUsers() {
//	    Connector connector = new Connector();
//	    Connection connection = connector.getConnection();
//	    try {
//	        Statement stmt = connection.createStatement();
//	        ResultSet rs = stmt.executeQuery("SELECT * FROM user");
//
//	        Set users = new HashSet();
//
//	        while(rs.next())
//	        {
//	            User user = extractUserFromResultSet(rs);
//	            users.add(user);
//	        }
//
//	        return users;
//
//	    } catch (SQLException ex) {
//	        ex.printStackTrace();
//	    }
//
//	    return null;
//	}
//	
//	public boolean insertUser(User user) {
//	    Connector connector = new Connector();
//	    Connection connection = connector.getConnection();
//	    try {
//	        PreparedStatement ps = connection.prepareStatement("INSERT INTO user VALUES (NULL, ?, ?, ?)");
//	        ps.setString(1, user.getName());
//	        ps.setString(2, user.getPass());
//	        ps.setInt(3, user.getAge());
//	        int i = ps.executeUpdate();
//
//	      if(i == 1) {
//	        return true;
//	      }
//
//	    } catch (SQLException ex) {
//	        ex.printStackTrace();
//	    }
//
//	    return false;
//	}
//	
//	public boolean updateUser(User user) {
//	    Connector connector = new Connector();
//	    Connection connection = connector.getConnection();
//	    try {
//	        PreparedStatement ps = connection.prepareStatement("UPDATE user SET name=?, pass=?, age=? WHERE id=?");
//	        ps.setString(1, user.getName());
//	        ps.setString(2, user.getPass());
//	        ps.setInt(3, user.getAge());
//	        ps.setInt(4, user.getId());
//	        int i = ps.executeUpdate();
//
//	      if(i == 1) {
//	    return true;
//	      }
//
//	    } catch (SQLException ex) {
//	        ex.printStackTrace();
//	    }
//
//	    return false;
//	}
//	
//	public boolean deleteUser(int id) {
//	    Connector connector = new Connector();
//	    Connection connection = connector.getConnection();
//	    try {
//	        Statement stmt = connection.createStatement();
//	        int i = stmt.executeUpdate("DELETE FROM user WHERE id=" + id);
//
//	      if(i == 1) {
//	    return true;
//	      }
//
//	    } catch (SQLException ex) {
//	        ex.printStackTrace();
//	    }
//
//	    return false;
//	}
	
}
