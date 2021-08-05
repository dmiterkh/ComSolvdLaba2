package com.solvd.mobileoperator.utils.propfolder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import com.solvd.mobileoperator.executor.Executor;
import org.apache.log4j.Logger;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class SecondProperties {

	private final static Logger LOGGER = Logger.getLogger(Executor.class);
	
	public void showSecondPropertiesTestCode() {	
		
		WRFromProp wrhp = new WRFromProp();
		String valueProp = wrhp.getValueFromProperties("second.properties","login");
		LOGGER.info(valueProp);
		String valueProp1 = wrhp.getValueFromProperties("second.properties","password");
		LOGGER.info(valueProp1);
		String valueProp2 = wrhp.getValueFromProperties("second.properties","age");
		LOGGER.info(valueProp2);
		
		PrintWriter outPutFile;
		try {
			outPutFile = new PrintWriter(new FileWriter("src/main/resources/second_outputfile.txt"));
			outPutFile.println(valueProp + "\n" + valueProp1 + "\n" + valueProp2 + "\n" + "======");
			outPutFile.close();		
		} catch (IOException e) {
			LOGGER.info("An error occurs: file second_outputfile.txt is not found!!!");
			e.printStackTrace();	
		}
		
		wrhp.setThreeValueToProperties("second.properties","login","user2","password","Alligator2","age","22");
		valueProp = wrhp.getValueFromProperties("second.properties","login");
		LOGGER.info(valueProp);
		valueProp1 = wrhp.getValueFromProperties("second.properties","password");
		LOGGER.info(valueProp1);
		valueProp2 = wrhp.getValueFromProperties("second.properties","age");
		LOGGER.info(valueProp2);
		
		wrhp.setTwoValueToProperties("second.properties","login","user3","password","Alligator3");
		valueProp = wrhp.getValueFromProperties("second.properties","login");
		LOGGER.info(valueProp);
		valueProp1 = wrhp.getValueFromProperties("second.properties","password");
		LOGGER.info(valueProp1);
		valueProp2 = wrhp.getValueFromProperties("second.properties","age");
		LOGGER.info(valueProp2);
		
		wrhp.setValueToProperties("second.properties","login","user4");
		valueProp = wrhp.getValueFromProperties("second.properties","login");
		LOGGER.info(valueProp);
		valueProp1 = wrhp.getValueFromProperties("second.properties","password");
		LOGGER.info(valueProp1);	
		valueProp2 = wrhp.getValueFromProperties("second.properties","age");
		LOGGER.info(valueProp2);	
		
		wrhp.setThreeValueToProperties("second.properties","login","user5","password","Alligator5","age","55");
		valueProp = wrhp.getValueFromProperties("second.properties","login");
		LOGGER.info(valueProp);
		valueProp1 = wrhp.getValueFromProperties("second.properties","password");
		LOGGER.info(valueProp1);
		valueProp2 = wrhp.getValueFromProperties("second.properties","age");
		LOGGER.info(valueProp2);
			
	}
}
