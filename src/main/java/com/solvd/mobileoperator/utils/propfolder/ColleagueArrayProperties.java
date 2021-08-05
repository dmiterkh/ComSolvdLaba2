package com.solvd.mobileoperator.utils.propfolder;

import com.solvd.mobileoperator.staff.Employee;               
import com.solvd.mobileoperator.staff.Boss;         		 
import com.solvd.mobileoperator.staff.ExpiriencedApplicant;
import com.solvd.mobileoperator.staff.Staff;
import com.solvd.mobileoperator.storage.ColleagueAr;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import com.solvd.mobileoperator.executor.Executor;

import org.apache.log4j.Logger;
import java.util.*; 

//import java.io.InputStreamReader;
//import java.io.BufferedReader;

public class ColleagueArrayProperties {

	private final static Logger LOGGER = Logger.getLogger(Executor.class);
	
	public void showColleagueArrayPropertiesTestCode() {			
	
		Scanner in = new Scanner(System.in);
		String index = "";
		
		Employee employee = new Employee(); 
		Boss boss = new Boss(); 
		ExpiriencedApplicant expiriencedApplicant = new ExpiriencedApplicant();
		
		int employeeIndex = 0;
		int bossIndex = 0;
		int expiriencedApplicantIndex = 0;	
		
		LOGGER.info("================================Scanner_1_ArrayList_Colleague_Properties================================");	
		
		ColleagueAr colleagueAr1 = new ColleagueAr();
		
		LOGGER.info("Enter the whole number of Employees");		
		employeeIndex = in.nextInt();
		LOGGER.info("Enter the whole number of Bosses");
		bossIndex = in.nextInt();
		LOGGER.info("Enter the whole number of Expirienced Applicants");
		expiriencedApplicantIndex = in.nextInt();
		in.nextLine();		
		
		
		
		PrintWriter outPutFile;
		try {
			outPutFile = new PrintWriter(new FileWriter("src/main/resources/mobile_outputfile.txt"));
			outPutFile.println("================================Scanner_1_ArrayList_Colleague_Properties================================");	
			outPutFile.println("Enter the whole number of Employees"  + "\n" + employeeIndex);
			outPutFile.println("Enter the whole number of Bosses"  + "\n" + bossIndex);
			outPutFile.println("Enter the whole number of Expirienced Applicants"  + "\n" + expiriencedApplicantIndex);
			outPutFile.println("====================================");
			outPutFile.close();		
		} catch (IOException e) {
			LOGGER.info("An error occurs: file second_outputfile.txt is not found!!!");
			e.printStackTrace();	
		}
			
				
			
		colleagueAr1.setListOfAllStaff(employee, employeeIndex, boss, bossIndex, expiriencedApplicant, expiriencedApplicantIndex);
		
		LOGGER.info("====================================");
		do {
			LOGGER.info("Would you like to get all of the information about all of the Colleagues? (y/n)" );
			index = in.nextLine();
			index = "y";
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(Staff staff : colleagueAr1.getListOfStaff()) {
					LOGGER.info(staff.toString());
					LOGGER.info("======");
					
				}
			} else {
				LOGGER.info("The required Storage is Null or Empty");	
			}				
		} else {
			LOGGER.info("OK, move forward!");
		}
		
		LOGGER.info("====================================");
		
		String sexIndex = "";
		int indexColleague = 1;
		String ageIndex = "";
		String salaryIndex = "";
		
		do {
			LOGGER.info("Would you like to set data to all of the Colleagues? (y/n)");
			index = in.nextLine();		
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(Staff staff : colleagueAr1.getListOfStaff()) {
					
					LOGGER.info("colleague " + indexColleague);
					LOGGER.info(staff.toString());
					LOGGER.info("======");
					
					
					do {
						LOGGER.info("Set sex to colleague " + indexColleague + " (" + staff.showStatus() + "): (f/m/trans)");
						sexIndex = in.nextLine();
						
						
					} while((!("f".equals(sexIndex)))&&(!("m".equals(sexIndex)))&&(!("trans".equals(sexIndex))));
					staff.setSex(sexIndex);
					
					LOGGER.info("Set age to colleague " + indexColleague);
					ageIndex = in.nextLine();				
					staff.setAge(Integer.parseInt(ageIndex));

					LOGGER.info("Set salary to colleague " + indexColleague);
					salaryIndex = in.nextLine();
					staff.setSalary(Integer.parseInt(salaryIndex));
					
					indexColleague++;
					LOGGER.info("======");
				}
			} else {
				LOGGER.info("The required Storage is Null or Empty");	
			}
		} else {
			LOGGER.info("OK, move forward!");
		}
		
		LOGGER.info("====================================");
		
		indexColleague = 1;
		
		do {
			LOGGER.info("Would you like to get all of the information about all of the Colleagues? (y/n)");
			index = in.nextLine();
			index = "y";
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(Staff staff : colleagueAr1.getListOfStaff()) {
					LOGGER.info("colleague " + indexColleague);
					LOGGER.info(staff.toString());
					LOGGER.info("======");
					
				}
			} else {
				LOGGER.info("The required Storage is Null or Empty");	
			}				
		} else {
			LOGGER.info("OK, move forward!");
		}
		
		indexColleague = 1;
		
		do {
			LOGGER.info("Would you like to put all of the information about all of the Colleagues to FILE? (y/n)");
			index = in.nextLine();
			index = "y";
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		
		String valueProp = "abc";
		String valueProp1 = "abc";
		String valueProp2 = "abc";
		String valueProp3 = "abc";
		String valueProp4 = "abc";
		String valueProp5 = "abc";
		String valueProp6 = "abc";
		
		LOGGER.info(valueProp);
		LOGGER.info(valueProp1 + "\n" +valueProp2 + "\n" +valueProp3 + "\n" +valueProp4 + "\n" +valueProp5 + "\n" + valueProp6);

		LOGGER.info("======");
		
		ColleagueArrayProp colArProp = new ColleagueArrayProp();
		
		valueProp = colArProp.getValueFromProperties("mobile.properties","age");
		valueProp1 = colArProp.getValueFromProperties("mobile.properties","status");
		valueProp2 = colArProp.getValueFromProperties("mobile.properties","age");
		valueProp3 = colArProp.getValueFromProperties("mobile.properties","sex");
		valueProp4 = colArProp.getValueFromProperties("mobile.properties","salary");
		valueProp5 = colArProp.getValueFromProperties("mobile.properties","aquire");
		valueProp6 = colArProp.getValueFromProperties("mobile.properties","work");
		
		LOGGER.info(valueProp);
		LOGGER.info(valueProp1 + "\n" +valueProp2 + "\n" +valueProp3 + "\n" +valueProp4 + "\n" +valueProp5 + "\n" + valueProp6);

		
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(Staff staff : colleagueAr1.getListOfStaff()) {
					
					LOGGER.info("======Colleague " + indexColleague + "======");
					
					valueProp = colArProp.getValueFromProperties("mobile.properties","colleague");
					valueProp1 = colArProp.getValueFromProperties("mobile.properties","status");
					valueProp2 = colArProp.getValueFromProperties("mobile.properties","age");
					valueProp3 = colArProp.getValueFromProperties("mobile.properties","sex");
					valueProp4 = colArProp.getValueFromProperties("mobile.properties","salary");
					valueProp5 = colArProp.getValueFromProperties("mobile.properties","aquire");
					valueProp6 = colArProp.getValueFromProperties("mobile.properties","work");
					
					LOGGER.info(valueProp);
					LOGGER.info(valueProp1 + "\n" +valueProp2 + "\n" +valueProp3 + "\n" +valueProp4 + "\n" +valueProp5 + "\n" + valueProp6);

					
					colArProp.setValueToProperties("mobile.properties","colleague", indexColleague);
					colArProp.setValueToProperties("mobile.properties","status", staff.showStatus());
					colArProp.setValueToProperties("mobile.properties","age", staff.showAge());
					colArProp.setValueToProperties("mobile.properties","sex", staff.showSex());
					colArProp.setValueToProperties("mobile.properties","salary", staff.showSalary());
					colArProp.setValueToProperties("mobile.properties","aquire", staff.aquire());
					colArProp.setValueToProperties("mobile.properties","work", staff.work());
					
					colArProp.setAllValuesToProperties("mobile.properties","colleague", indexColleague,"status", staff.showStatus(),"age", staff.showAge(),"sex", staff.showSex(),"salary", staff.showSalary(),"aquire", staff.aquire(),"work", staff.work());
					
//					String valueProp = wrhp.getValueFromProperties("second.properties","age");
					


					indexColleague++;
				}
			} else {
				LOGGER.info("The required Storage is Null or Empty");	
			}				
		} else {
			LOGGER.info("OK, move forward!");
		}
		
		LOGGER.info("====================================");
		LOGGER.info("THAT'S IT for Scanner_1_ArrayList_Colleague_Properties");
		LOGGER.info("====================================");	
	}	

}
