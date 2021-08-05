package com.solvd.mobileoperator.database;

import java.sql.*;

import org.apache.log4j.Logger;
import com.solvd.mobileoperator.executor.Executor;
import com.solvd.mobileoperator.staff.Employee;

import java.util.Set;
import java.util.HashSet;

public class ConnectionRaviDao {
	
	private final static Logger LOGGER = Logger.getLogger(Executor.class);
	
	public void functionInsertDao1() {
	
		String sqlQuery = "INSERT INTO staff (st_age, st_sex, st_salary, st_status) VALUES (34, 'f', 1500, 'employee')";
		String sqlQuery1 = "INSERT INTO staff (st_age, st_sex, st_salary, st_status) VALUES (29, 'm', 2500, 'boss')";
		String sqlQuery2 = "INSERT INTO staff (st_age, st_sex, st_salary, st_status) VALUES (19, 'trans', 1000, 'expiriencedApplicant')";
		Connector conn = new Connector();
		
		LOGGER.info("The Insert 1 function has been launched.");
		try {
			Statement st = conn.connect().createStatement();
			int rows = 0; 
			rows = st.executeUpdate(sqlQuery);
			if (rows > 0) {
				System.out.println("A new row has been inserted.");
			}
			rows = 0; 
			rows = st.executeUpdate(sqlQuery1);
			if (rows > 0) {
				System.out.println("A new row has been inserted.");
			}
			rows = 0; 
			rows = st.executeUpdate(sqlQuery2);
			if (rows > 0) {
				LOGGER.info("A new row has been inserted.");
			}
		} catch(SQLException e) {
			e.printStackTrace();
			LOGGER.info("An error has been occured.");
		} finally {
			LOGGER.info("The Insert 1 function has been finished.");
		}
	}
			
	
	
	public void functionInsertDao2() {
	
		String sqlQuery = "INSERT INTO staff (st_age, st_sex, st_salary, st_status) VALUES (?, ?, ?, ?)";
		Connector conn = new Connector();
		
		LOGGER.info("The Insert 2 function has been launched.");
		try {
			PreparedStatement pst = conn.connect().prepareStatement(sqlQuery);
				
			pst.setInt(1,35);
			pst.setString(2,"f");
			pst.setInt(3,1100);
			pst.setString(4,"employee");
							
			int rows = 0; 
			rows = pst.executeUpdate();
			if (rows > 0) {
				LOGGER.info("A new row has been inserted.");
			}
		} catch(SQLException e) {
			e.printStackTrace();
			LOGGER.info("An error has been occured.");
		} finally {
			LOGGER.info("The Insert 2 function has been finished.");
		}	
	}	
	
	
	
	public void functionSelectDao1() {
		
		String sqlQuery = "Select * FROM staff";
		Connector conn = new Connector();
		
		LOGGER.info("The Select 1 function has been launched.");
		try {
			PreparedStatement pst = conn.connect().prepareStatement(sqlQuery);
			ResultSet res =  pst.executeQuery();
			while (res.next()){
				String strRes1 = res.getString(1);
				String strRes2 = res.getString(2);
				String strRes3 = res.getString(3);
				String strRes4 = res.getString(4);
				String strRes5 = res.getString(5);
				LOGGER.info(strRes1 + ", " + strRes2 + ", " + strRes3 + ", " + strRes4 + ", " + strRes5);
			}
			LOGGER.info("Data have been selected.");
		} catch(SQLException e) {
			e.printStackTrace();
			LOGGER.info("An error has been occured.");
		} finally {
			LOGGER.info("The Select 1 function has been finished.");
		}	
	}

	
	
	public void functionSelectDao2() {
		
		String sqlQuery = "Select * FROM staff";
		Connector conn = new Connector();
	
		LOGGER.info("The Select 2 function has been launched.");
		try {
			Statement st = conn.connect().createStatement();
			ResultSet res =  st.executeQuery(sqlQuery);
			
			while (res.next()) {
				int id = res.getInt("st_id");
				int age = res.getInt("st_age");
				String sex = res.getString("st_sex");
				int salary = res.getInt("st_salary");
				String status = res.getString("st_status");
				System.out.printf("%d - %d - %s - %d - %s \n", id, age, sex, salary, status, "\n");
			}
			LOGGER.info("A new row has been inserted.");
		} catch(SQLException e) {
			e.printStackTrace();
			LOGGER.info("An error has been occured.");
		} finally {
			LOGGER.info("The Select 2 function has been finished.");
		}	
	}
	
	
	
	public Employee functionGetEmployeeDao1(int id) {
	
		String sqlQuery = "SELECT * FROM staff WHERE st_id = " + id + "AND st_status = 'employee'";
		Connector conn = new Connector();	
	
		LOGGER.info("The GetEmployee 1 function has been launched.");
		try {
			Statement st = conn.connect().createStatement();
			ResultSet res = st.executeQuery(sqlQuery);
			Employee employee = new Employee();
		
			if(res.next())
			{
				employee.setId( res.getInt("st_id") );
				employee.setAge( res.getInt("st_age") );
				employee.setSex( res.getString("st_sex") );
				employee.setSalary( res.getInt("st_salary") );
				employee.setStatus( res.getString("st_status") );
			}
		
			LOGGER.info(employee);
			LOGGER.info("An employee has been got.");
        
		} catch (SQLException e) {
            e.printStackTrace();
			LOGGER.info("An error has been occured.");
		} finally {
			LOGGER.info("The GetEmployee 1 function has been finished.");
		}
		
		return null;
	}
	
	
	
	private Employee extractUserFromResultSet(ResultSet res) throws SQLException {
				
		Employee employee = new Employee();

		employee.setId( res.getInt("st_id") );
		employee.setAge( res.getInt("st_age") );
		employee.setSex( res.getString("st_sex") );
		employee.setSalary( res.getInt("st_salary") );
		employee.setStatus( res.getString("st_status") );
		
		LOGGER.info(employee);
		LOGGER.info("An employee has been got.");

		return employee;

	}

	
	public Employee functionGetEmployeeDao2(int id) {
		
		String sqlQuery = "SELECT * FROM staff WHERE st_id = " + id + "AND st_status = 'employee'";
		Connector conn = new Connector();
		
		LOGGER.info("The GetEmployee 2 function has been launched.");
		try {
			Statement st = conn.connect().createStatement();
			ResultSet res = st.executeQuery(sqlQuery);

			if(res.next())
			{
				return extractUserFromResultSet(res);
			}
			
		} catch (SQLException e) {
            e.printStackTrace();
			LOGGER.info("An error has been occured.");
		} finally {
			LOGGER.info("The GetEmployee 2 function has been finished.");
		}

		return null;
	}
	
	
	public Employee functionGetEmployeeByAgeAndSexDao(int age, String sex) {
    
		String sqlQuery = "SELECT * FROM staff WHERE st_age = ? AND st_sex = ?";
		Connector connector = new Connector();
    
		LOGGER.info("The GetEmployeeByAgeAndSexDao function has been launched.");
		try {
			PreparedStatement pst = connector.connect().prepareStatement(sqlQuery);
			pst.setInt(1, age);
			pst.setString(2, sex);
			ResultSet res = pst.executeQuery();

//			Statement st = connector.connect().createStatement();
//			ResultSet res = st.executeQuery(sqlQuery);
			
			if(res.next())
			{
				return extractUserFromResultSet(res);
			}
	
		} catch (SQLException e) {
            e.printStackTrace();
			LOGGER.info("An error has been occured.");
		} finally {
			LOGGER.info("The GetEmployee 2 function has been finished.");
		}

		return null;
	}

	public Set functionGetAllEmployeesDao() {
		
		String sqlQuery = "SELECT * FROM staff";
		Connector conn = new Connector();
		
		LOGGER.info("The GetAllEmployeesDao function has been launched.");
		try {
			Statement st = conn.connect().createStatement();
			ResultSet res = st.executeQuery(sqlQuery);

			Set employees = new HashSet();

			while(res.next())
			{
				Employee employee = extractUserFromResultSet(res);
				employees.add(employee);
			}
			LOGGER.info(employees);	
			LOGGER.info("Set of all of the employees has been got.");
			return employees;

		} catch (SQLException e) {
            e.printStackTrace();
			LOGGER.info("An error has been occured.");
		} finally {
			LOGGER.info("The GetEmployee 2 function has been finished.");
		}

    return null;
}
	
	
	
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
	
	
//	public boolean updateUser(User user) {
//    Connector connector = new Connector();
//    Connection connection = connector.getConnection();
//    try {
//        PreparedStatement ps = connection.prepareStatement("UPDATE user SET name=?, pass=?, age=? WHERE id=?");
//        ps.setString(1, user.getName());
//        ps.setString(2, user.getPass());
//        ps.setInt(3, user.getAge());
//        ps.setInt(4, user.getId());
//        int i = ps.executeUpdate();
//
//      if(i == 1) {
//    return true;
//      }
//
//    } catch (SQLException ex) {
//        ex.printStackTrace();
//    }
//
//    return false;
//}
//
//public boolean deleteUser(int id) {
//    Connector connector = new Connector();
//    Connection connection = connector.getConnection();
//    try {
//        Statement stmt = connection.createStatement();
//        int i = stmt.executeUpdate("DELETE FROM user WHERE id=" + id);
//
//      if(i == 1) {
//    return true;
//      }
//
//    } catch (SQLException ex) {
//        ex.printStackTrace();
//    }
//
//    return false;
//}	
	
}
