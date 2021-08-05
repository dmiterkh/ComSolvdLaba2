package com.solvd.mobileoperator.utils.propfolder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class WRFromProp {
	
//	path to our file
	public static final String PATH_TO_FILE = "src/main/resources/second.properties";

	public String getValueFromProperties(String pass, String key) {
	
		Properties prop = new Properties();
		FileInputStream finst = null;		//??	Why we cannot declare it in the try block of the exception? 

		try {		
//			finst = new FileInputStream(path);  //??	Why it does not work?	
		
			finst = new FileInputStream(PATH_TO_FILE);
			prop.load(finst);
			finst.close();
			return prop.getProperty(key);		
		} catch (IOException e) {
			System.out.println("An error occurs: file " + PATH_TO_FILE + " is not found!!!");
			e.printStackTrace();
		}
	
//??	Why do we return "default"?
		return "default";
	}	

	public void setValueToProperties(String path, String key, String value) {
			
		Properties prop = new Properties();
		try {
			FileOutputStream foutst = new FileOutputStream(PATH_TO_FILE);
			prop.setProperty(key, value);
			prop.store(foutst, "");
			foutst.close();		
			System.out.println(prop + "\n" + "======");				
		} catch (IOException e) {
			System.out.println("An error occurs: file " + PATH_TO_FILE + " is not found!!!");
			e.printStackTrace();	
		}
	}
	
	
	
	public void setTwoValueToProperties(String path, String key, String value, String key1, String value1) {
			
		Properties prop = new Properties();
		try {
			FileOutputStream foutst = new FileOutputStream(PATH_TO_FILE);
			prop.setProperty(key, value);
			prop.setProperty(key1, value1);
			prop.store(foutst, "");
			foutst.close();		
			System.out.println(prop);				
		} catch (IOException e) {
			System.out.println("An error occurs: file " + PATH_TO_FILE + " is not found!!!");
			e.printStackTrace();	
		}
	}

	public void setThreeValueToProperties(String path, String key, String value, String key1, String value1, String key2, String value2) {
		
		Properties prop = new Properties();
		try {
			FileOutputStream foutst = new FileOutputStream(PATH_TO_FILE);
			prop.setProperty(key, value);
			prop.setProperty(key1, value1);
			prop.setProperty(key2, value2);
			prop.store(foutst, "");
			foutst.close();		
			System.out.println(prop);			
		} catch (IOException e) {
			System.out.println("An error occurs: file " + PATH_TO_FILE + " is not found!!!");
			e.printStackTrace();	
		}
	}
}	