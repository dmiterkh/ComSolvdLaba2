package com.solvd.mobileoperator.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import com.solvd.mobileoperator.executor.Executor;

public class Connector {
	
	private final static Logger LOGGER = Logger.getLogger(Executor.class);
	
	private final String jdbcURL = "jdbc:postgresql://localhost:5432/mobileoperator";
	private final String username = "postgres";
	private final String password = "admin77dim";
	
	public Connection connect() {
		
		LOGGER.info("Connection to PostgreSQL started.");
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(jdbcURL, username, password);
			LOGGER.info("Connection to PostgreSQL occured successfully.");
//			conn.close();
		} catch(SQLException e) {
			LOGGER.info("Error occured during the connection to PostgreSQL.");
			e.printStackTrace();
		} finally {
			LOGGER.info("Connection to PostgreSQL finished.");
		}	
		return conn;
	}

}