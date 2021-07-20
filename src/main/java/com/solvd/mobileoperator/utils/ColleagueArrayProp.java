package com.solvd.mobileoperator.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;


public class ColleagueArrayProp {

	public static final String PATH_TO_FILE = "mobile.properties";

	public String getValueFromProperties(String key, String value) {
	
		Properties prop = new Properties();
		FileInputStream finst = null;

		try {		
			finst = new FileInputStream(PATH_TO_FILE);
			prop.load(finst);
			finst.close();
			return prop.getProperty(key);		
		} catch (IOException e) {
			System.out.println("An error occurs: file " + PATH_TO_FILE + " is not found!!!");
			e.printStackTrace();
		}
		return "default";
	}	

	public void setValueToProperties(String path, String key, String value) {
	
		
		PrintWriter outPutFile;
		try {
			outPutFile = new PrintWriter(new FileWriter("outputfile.txt"));
			
		Properties prop = new Properties();
		try {
			FileOutputStream foutst = new FileOutputStream(PATH_TO_FILE);
			prop.setProperty(key, value);
			prop.store(foutst, "");
			foutst.close();		
			System.out.println(prop);
		
			outPutFile.println(prop);
		
		} catch (IOException e) {
			System.out.println("An error occurs: file " + PATH_TO_FILE + " is not found!!!");
			e.printStackTrace();	
		}
		
			outPutFile.close();		
		} catch (IOException e) {
			System.out.println("An error occurs: file outputfile.txt is not found!!!");
			e.printStackTrace();	
		} 
	}
	
//  OverLoading
	public void setValueToProperties(String path, String key, int intValue) {
		
		PrintWriter outPutFile;
		try {
			outPutFile = new PrintWriter(new FileWriter("mobile_outputfile.txt"));
			
		Properties prop = new Properties();
		try {
			FileOutputStream foutst = new FileOutputStream(PATH_TO_FILE);
			String value = String.valueOf(intValue);
			prop.setProperty(key, value);
			prop.store(foutst, "");
			foutst.close();		
			System.out.println(prop);	
		
			outPutFile.println(prop);
		
		} catch (IOException e) {
			System.out.println("An error occurs: file " + PATH_TO_FILE + " is not found!!!");
			e.printStackTrace();	
		}
		
			outPutFile.close();		
		} catch (IOException e) {
			System.out.println("An error occurs: file outputfile.txt is not found!!!");
			e.printStackTrace();	
		} 
	}
	
	public void setAllValuesToProperties(String path, String keyId, int valueId, String keyStatus, String valueStatus, String keyAge, int valueAge, String keySex, String valueSex, String keySalary, int valueSalary, String keyAquire, String valueAquire, String keyWork, String valueWork) {
		
		PrintWriter outPutFile;
		try {
			outPutFile = new PrintWriter(new FileWriter("outputfile.txt"));
		
		Properties prop = new Properties();
		try {
			FileOutputStream foutst = new FileOutputStream(PATH_TO_FILE);
			String valueIdStr = String.valueOf(valueId);
			prop.setProperty(keyId, valueIdStr);
			prop.setProperty(keyStatus, valueStatus);
			String valueAgeStr = String.valueOf(valueAge);
			prop.setProperty(keyAge, valueAgeStr);
			prop.setProperty(keySex, valueSex);
			String valueSalaryStr = String.valueOf(valueSalary);	
			prop.setProperty(keySalary, valueSalaryStr);
			prop.setProperty(keyAquire, valueAquire);
			prop.setProperty(keyWork, valueWork);				
			prop.store(foutst, "");
			foutst.close();		
			System.out.println(prop);	
		
			outPutFile.println(prop);

		} catch (IOException e) {
			System.out.println("An error occurs: file " + PATH_TO_FILE + " is not found!!!");
			e.printStackTrace();	
		}
		
			outPutFile.close();		
		} catch (IOException e) {
			System.out.println("An error occurs: file outputfile.txt is not found!!!");
			e.printStackTrace();	
		} 
	}
}	