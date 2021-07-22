package com.solvd.mobileoperator.menu;

import com.solvd.mobileoperator.staff.Employee;               // Initial Interface Trainee, Extension, Implementation: 
import com.solvd.mobileoperator.staff.Boss;         		 
import com.solvd.mobileoperator.staff.ExpiriencedApplicant;   // Class ExpiriencedApplicant extends Abstract Class Unemployed and implements Interface Staff
   
import com.solvd.mobileoperator.storage.Colleague;            // Polymorphizm: Interface Staff Ar, Li, HS, HM
import com.solvd.mobileoperator.storage.ColleagueAr;
import com.solvd.mobileoperator.storage.ColleagueColl;
import com.solvd.mobileoperator.staff.Staff; 
import com.solvd.mobileoperator.comparator.StatusCompare;            // Polymorphizm: Interface Staff 
import com.solvd.mobileoperator.comparator.SexCompare;

import com.solvd.mobileoperator.exception.EntryCheck;
import com.solvd.mobileoperator.exception.EntryIsEmptyException;
import com.solvd.mobileoperator.exception.EntryIsNegativeIntegerException;
import com.solvd.mobileoperator.exception.EntryIsNotAnIntegerException;
import com.solvd.mobileoperator.exception.EntryIsNotANumberException;
import com.solvd.mobileoperator.exception.ListCheck;
import com.solvd.mobileoperator.exception.ListIsEmptyException;
import com.solvd.mobileoperator.exception.ListIsNullException;
import com.solvd.mobileoperator.executor.Executor;

import java.util.*; // Scanner, Arrays, List(etc), Set(etc), Map (etc), Collection, Collections, Comparator, Iterator, ListIterator  

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import com.solvd.mobileoperator.utils.WRFromProp;
import com.solvd.mobileoperator.utils.ColleagueArrayProp;
import java.io.*;

import com.solvd.mobileoperator.utils.JsonExecAnimal;
import com.solvd.mobileoperator.staff.Animal;
import com.solvd.mobileoperator.staff.AnimalPlace;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import com.solvd.mobileoperator.utils.JsonExec;
import com.fasterxml.jackson.core.JsonGenerator;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.Object.*;

public class Menu {
	
	private final static Logger LOGGER = Logger.getLogger(Executor.class);
	
	public Menu() {

	}	 
	
	
	public void showPropertiesTestCode() {	
	
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
	
	
	public void showJsonTestCodeAnimal() {	
		
		AnimalPlace place = new AnimalPlace();
		place.setTitle("Worldd");
		
		AnimalPlace place1 = new AnimalPlace();
		place1.setTitle("Europee");
		
		AnimalPlace place2 = new AnimalPlace();
		place2.setTitle("Asiaa");
		
		Animal animal = new Animal();
		animal.setId(13213);
		animal.setName("Rex_Rexie");
		animal.getName();
		animal.setPlace(place);
		
		
		Animal animal1 = new Animal();
		animal1.setId(14324);
		animal1.setName("Rex1_Rexie");
		animal1.getName();
		animal1.setPlace(place1);
		
		Animal animal2 = new Animal();
		animal2.setId(15435);
		animal2.setName("Rex2_Rexie");
		animal2.getName();
		animal2.setPlace(place2);
		
		
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(animal);
		animals.add(animal1);
		animals.add(animal2);
		LOGGER.info("=======================================");
		LOGGER.info("======showJsonTestCodeAnimal()========");
		LOGGER.info("=======================================");
		LOGGER.info(animal.getId());
		LOGGER.info("=============");
		
		
		JsonExecAnimal jsonAction = new JsonExecAnimal();
		
		String jsonSrt = jsonAction.convertJavaToJsonStr(animal);
		
		LOGGER.info(jsonSrt);
		LOGGER.info("================");
		jsonAction.convertJavaToJsonFile(animal, "src/main/resources/animal.json");
		
		jsonAction.convertJavaToJsonFile(animals, "src/main/resources/animals.json");
		
		
		String jsonStr1 = "{\"name\":\"Jack\",\"id\":90987,\"place\":{\"title\":\"North America\"}}";
		
		Animal animal4 = jsonAction.convertJsonStrToAnimalPOJO(jsonStr1);
		
		LOGGER.info("Name from POJO: " + animal4.getName());
		LOGGER.info("Name place from POJO: " + animal4.getPlace().getTitle());		
		
			
	}
		
	
	public void showJsonTestCodeStaff() {
		LOGGER.info("\n\n\n");
		LOGGER.info("=======================================");
		LOGGER.info("======showJsonTestCodeStaff()========");
		LOGGER.info("=======================================");
		
		
		Employee employee = new Employee(25, "f"); 
		employee.setInfoAgain(26, "f", 2000, "employee");
		Boss boss = new Boss(76, "m"); 
		boss.setInfoAgain(46, "m", 3000, "boss");
		ExpiriencedApplicant expiriencedApplicant = new ExpiriencedApplicant(56, "trans");
		expiriencedApplicant.setInfoAgain(16, "trans", 1500, "expirienced applicant");

		
		List<Staff> staff = new ArrayList<Staff>();
		
		staff.add(employee);
		staff.add(boss);
		staff.add(expiriencedApplicant);
				
		LOGGER.info("=============");
		LOGGER.info("\n" + employee);
		LOGGER.info("=============");
		LOGGER.info("\n" + staff);
		
		JsonExec jsonAction = new JsonExec();
//		JsonExecAnimal jsonAction = new JsonExecAnimal();
		
		String jsonSrt = jsonAction.convertJavaToJsonStr(employee);
//		String jsonSrt1 = jsonAction.convertJavaToJsonStr(boss);
//		String jsonSrt2 = jsonAction.convertJavaToJsonStr(expiriencedApplicant);
//		
//		LOGGER.info(jsonSrt);
//		LOGGER.info("================================================================");
//		
//		jsonAction.convertJavaToJsonFile(employee, "employee.json");
//		jsonAction.convertJavaToJsonFile(boss, "boss.json");
//		jsonAction.convertJavaToJsonFile(expiriencedApplicant, "expiriencedApplicant.json");
//		jsonAction.convertJavaToJsonFile(staff, "staff.json");
//				
//		String jsonStrEmp = "";
//		String jsonStrBos = "";
//		String jsonStrExp = "";
//				
////		String jsonStrEmp = "{\"name\":\"Jack\",\"id\":90987,\"place\":{\"title\":\"North America\"}}";
////		String jsonStrBos = "{\"name\":\"Jack\",\"id\":90987,\"place\":{\"title\":\"North America\"}}";
////		String jsonStrExp = "{\"name\":\"Jack\",\"id\":90987,\"place\":{\"title\":\"North America\"}}";
//		
//		Employee employee2 = jsonAction.convertJsonStrToEmployeePOJO(jsonStrEmp);
//		Boss boss2 = jsonAction.convertJsonStrToBossPOJO(jsonStrBos);
//		ExpiriencedApplicant experiencedApplicant2 = jsonAction.convertJsonStrToExpiriencedApplicantPOJO(jsonStrExp);
//																
//		LOGGER.info("Name from POJO: " + employee2.showStatus());
//		LOGGER.info("Name from POJO: " + employee2.showAge());
//		LOGGER.info("Name from POJO: " + employee2.showSex());
//		LOGGER.info("Name from POJO: " + employee2.showSalary());
//		LOGGER.info("Name from POJO: " + employee2.work());
//		LOGGER.info("Name from POJO: " + employee2.aquire());
//		
//		LOGGER.info("Name from POJO: " + boss2.showStatus());
//		LOGGER.info("Name from POJO: " + boss2.showAge());
//		LOGGER.info("Name from POJO: " + boss2.showSex());
//		LOGGER.info("Name from POJO: " + boss2.showSalary());
//		LOGGER.info("Name from POJO: " + boss2.work());
//		LOGGER.info("Name from POJO: " + boss2.aquire());
//		LOGGER.info("Name from POJO: " + boss2.hirePeople());
//		LOGGER.info("Name from POJO: " + boss2.firePeople());
//		
//		LOGGER.info("Name from POJO: " + experiencedApplicant2.showStatus());
//		LOGGER.info("Name from POJO: " + experiencedApplicant2.showAge());
//		LOGGER.info("Name from POJO: " + experiencedApplicant2.showSex());
//		LOGGER.info("Name from POJO: " + experiencedApplicant2.showSalary());
//		LOGGER.info("Name from POJO: " + experiencedApplicant2.work());
//		LOGGER.info("Name from POJO: " + experiencedApplicant2.aquire());
		
	}	
		
	
	public void showArrayListOperations() {			

	
	
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
		
//		do {
//			LOGGER.info("Would you like to put all of the information about all of the Colleagues to FILE? (y/n)");
//			index = in.nextLine();
//			index = "y";
//		} while((!("y".equals(index)))&&(!("n".equals(index))));
//		
//		
//		String valueProp = "abc";
//		String valueProp1 = "abc";
//		String valueProp2 = "abc";
//		String valueProp3 = "abc";
//		String valueProp4 = "abc";
//		String valueProp5 = "abc";
//		String valueProp6 = "abc";
//		
//		LOGGER.info(valueProp);
//		LOGGER.info(valueProp1 + "\n" +valueProp2 + "\n" +valueProp3 + "\n" +valueProp4 + "\n" +valueProp5 + "\n" + valueProp6);
//
//		LOGGER.info("======");
//		
//		ColleagueArrayProp colArProp = new ColleagueArrayProp();
//		
//		valueProp = colArProp.getValueFromProperties("mobile.properties","age");
//		valueProp1 = colArProp.getValueFromProperties("mobile.properties","status");
//		valueProp2 = colArProp.getValueFromProperties("mobile.properties","age");
//		valueProp3 = colArProp.getValueFromProperties("mobile.properties","sex");
//		valueProp4 = colArProp.getValueFromProperties("mobile.properties","salary");
//		valueProp5 = colArProp.getValueFromProperties("mobile.properties","aquire");
//		valueProp6 = colArProp.getValueFromProperties("mobile.properties","work");
//		
//		LOGGER.info(valueProp);
//		LOGGER.info(valueProp1 + "\n" +valueProp2 + "\n" +valueProp3 + "\n" +valueProp4 + "\n" +valueProp5 + "\n" + valueProp6);
//
//		
//		if ("y".equals(index)) {
//			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
//				for(Staff staff : colleagueAr1.getListOfStaff()) {
//					
//					LOGGER.info("======Colleague " + indexColleague + "======");
//					
//					valueProp = colArProp.getValueFromProperties("mobile.properties","colleague");
//					valueProp1 = colArProp.getValueFromProperties("mobile.properties","status");
//					valueProp2 = colArProp.getValueFromProperties("mobile.properties","age");
//					valueProp3 = colArProp.getValueFromProperties("mobile.properties","sex");
//					valueProp4 = colArProp.getValueFromProperties("mobile.properties","salary");
//					valueProp5 = colArProp.getValueFromProperties("mobile.properties","aquire");
//					valueProp6 = colArProp.getValueFromProperties("mobile.properties","work");
//					
//					LOGGER.info(valueProp);
//					LOGGER.info(valueProp1 + "\n" +valueProp2 + "\n" +valueProp3 + "\n" +valueProp4 + "\n" +valueProp5 + "\n" + valueProp6);
//
//					
//					colArProp.setValueToProperties("mobile.properties","colleague", indexColleague);
//					colArProp.setValueToProperties("mobile.properties","status", staff.showStatus());
//					colArProp.setValueToProperties("mobile.properties","age", staff.showAge());
//					colArProp.setValueToProperties("mobile.properties","sex", staff.showSex());
//					colArProp.setValueToProperties("mobile.properties","salary", staff.showSalary());
//					colArProp.setValueToProperties("mobile.properties","aquire", staff.aquire());
//					colArProp.setValueToProperties("mobile.properties","work", staff.work());
//					
//					colArProp.setAllValuesToProperties("mobile.properties","colleague", indexColleague,"status", staff.showStatus(),"age", staff.showAge(),"sex", staff.showSex(),"salary", staff.showSalary(),"aquire", staff.aquire(),"work", staff.work());
//					
////					String valueProp = wrhp.getValueFromProperties("second.properties","age");
//					
//
//
//					indexColleague++;
//				}
//			} else {
//				LOGGER.info("The required Storage is Null or Empty");	
//			}				
//		} else {
//			LOGGER.info("OK, move forward!");
//		}
		

//
//		
//		
//		
//		
//		LOGGER.info("====================================");
//		LOGGER.info("THAT'S IT for Scanner_1_ArrayList_Colleague_Properties");
//		LOGGER.info("====================================");	
		


			

	


}












//	private boolean isInteger(int expiriencedApplicantIndex) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	

//public void showArrayListOperations() {		
//
//Scanner in = new Scanner(System.in);
//String index = "";
//
//Employee employee = new Employee(); 
//Boss boss = new Boss(); 
//ExpiriencedApplicant expiriencedApplicant = new ExpiriencedApplicant();
//
//int employeeIndex = 0;
//int bossIndex = 0;
//int expiriencedApplicantIndex = 0;	
//
//LOGGER.info("================================Scanner_1_ArrayList_Colleague================================");	
//ColleagueAr colleagueAr1 = new ColleagueAr();
//EntryCheck entryCheck = new EntryCheck ();	
//
//do {	
//
//String empIndexStr = "";
//String bosIndexStr = "";
//String expIndexStr = "";
//
//try {
//
//	LOGGER.info("Enter the whole number of Employees");
//	empIndexStr = in.nextLine();
//	LOGGER.info("Enter the whole number of Bosses");
//	bosIndexStr = in.nextLine();
//	LOGGER.info("Enter the whole number of Expirienced Applicants");
//	expIndexStr = in.nextLine();
//	
//	entryCheck.emptyCheck(empIndexStr);
//	entryCheck.negativeIntegerCheck(empIndexStr);
//	entryCheck.emptyCheck(bosIndexStr);
//	entryCheck.negativeIntegerCheck(bosIndexStr);
//	entryCheck.emptyCheck(expIndexStr);
//	entryCheck.negativeIntegerCheck(expIndexStr);
//	
//} catch (EntryIsEmptyException e) {
//	e.printStackTrace(System.out);					
//	LOGGER.info("EntryIsEmptyException has been caught");
//	continue;
//	
//} catch (EntryIsNegativeIntegerException e){
//	e.printStackTrace(System.out);					
//	LOGGER.info("EntryIsNegativeNumberException has been caught");
//	continue;
//	
//} catch (NumberFormatException e){
//	e.printStackTrace(System.out);	
//    LOGGER.info("NumberFormatException has been caught");
//    continue;	
//	
////} catch (EntryIsNotAnIntegerException e){
////	e.printStackTrace(System.out);					
////	LOGGER.info("EntryIsNotAnIntegerException has been caught");	
////	
////} catch (EntryIsNotANumberException e){
////	e.printStackTrace(System.out);					
////	LOGGER.info("EntryIsNotANumberException has been caught");	
//
//} finally {
//	LOGGER.info("All the possible Exceptions have been caught\n");
//
//}				
//
//employeeIndex = Integer.parseInt(empIndexStr);
//bossIndex = Integer.parseInt(bosIndexStr);
//expiriencedApplicantIndex = Integer.parseInt(expIndexStr);
//
//} while((!isInteger(employeeIndex))&&(!isInteger(bossIndex))&&(!isInteger(expiriencedApplicantIndex)));					
//in.nextLine();

		
}