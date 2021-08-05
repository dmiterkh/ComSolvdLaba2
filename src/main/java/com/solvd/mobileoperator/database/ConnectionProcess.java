package com.solvd.mobileoperator.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.solvd.mobileoperator.database.Connector;;

public class ConnectionProcess {

	String query = "Select * FROM Customer";
	Connector conn = new Connector();
	
	public void connectionProcessFunction() {
		try {
			PreparedStatement pst = conn.connect().prepareStatement(query);
			ResultSet rs =  pst.executeQuery();
			String strRes = rs.getString(1);
			System.out.println(strRes);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}