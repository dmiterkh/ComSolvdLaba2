package com.solvd.mobileoperator.database;

import java.sql.*;

import org.apache.log4j.Logger;
import com.solvd.mobileoperator.executor.Executor;

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
				
			pst.setInt(1,45);
			pst.setString(2,"m");
			pst.setInt(3,3500);
			pst.setString(4,"boss");
							
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

}
