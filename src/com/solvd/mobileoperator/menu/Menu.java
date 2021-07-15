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
import java.util.*; // Scanner, Arrays, List(etc), Set(etc), Map (etc), Collection, Collections, Comparator, Iterator, ListIterator  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.solvd.mobileoperator.utils.WRFromProp;
import com.solvd.mobileoperator.utils.ColleagueArrayProp;
 
//11111

public class Menu {
	
	public Menu() {

	}	 
	
	public void showPropertiesTestCode() {	
		
		WRFromProp wrhp = new WRFromProp();
		String valueProp = wrhp.getValueFromProperties("second.properties","login");
		System.out.println(valueProp);
		valueProp = wrhp.getValueFromProperties("second.properties","password");
		System.out.println(valueProp);
		valueProp = wrhp.getValueFromProperties("second.properties","age");
		System.out.println(valueProp);
		
		wrhp.setThreeValueToProperties("second.properties","login","user2","password","Alligator2","age","22");
		valueProp = wrhp.getValueFromProperties("second.properties","login");
		System.out.println(valueProp);
		valueProp = wrhp.getValueFromProperties("second.properties","password");
		System.out.println(valueProp);
		valueProp = wrhp.getValueFromProperties("second.properties","age");
		System.out.println(valueProp);
		
		wrhp.setTwoValueToProperties("second.properties","login","user3","password","Alligator3");
		valueProp = wrhp.getValueFromProperties("second.properties","login");
		System.out.println(valueProp);
		valueProp = wrhp.getValueFromProperties("second.properties","password");
		System.out.println(valueProp);
		valueProp = wrhp.getValueFromProperties("second.properties","age");
		System.out.println(valueProp);
		
		wrhp.setValueToProperties("second.properties","login","user4");
		valueProp = wrhp.getValueFromProperties("second.properties","login");
		System.out.println(valueProp);
		valueProp = wrhp.getValueFromProperties("second.properties","password");
		System.out.println(valueProp);	
		valueProp = wrhp.getValueFromProperties("second.properties","age");
		System.out.println(valueProp);	
		
		wrhp.setThreeValueToProperties("second.properties","login","user5","password","Alligator5","age","5555");
		valueProp = wrhp.getValueFromProperties("second.properties","login");
		System.out.println(valueProp);
		valueProp = wrhp.getValueFromProperties("second.properties","password");
		System.out.println(valueProp);
		valueProp = wrhp.getValueFromProperties("second.properties","age");
		System.out.println(valueProp);
		
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
		
		System.out.println("================================Scanner_1_ArrayList_Colleague================================");	
		ColleagueAr colleagueAr1 = new ColleagueAr();
//		EntryCheck entryCheck = new EntryCheck ();	
//		
//		do {	
//			
//			String empIndexStr = "";
//			String bosIndexStr = "";
//			String expIndexStr = "";
//			
//			try {
//
//				System.out.println("Enter the whole number of Employees");
//				empIndexStr = in.nextLine();
//				System.out.println("Enter the whole number of Bosses");
//				bosIndexStr = in.nextLine();
//				System.out.println("Enter the whole number of Expirienced Applicants");
//				expIndexStr = in.nextLine();
//				
//				entryCheck.emptyCheck(empIndexStr);
//				entryCheck.negativeIntegerCheck(empIndexStr);
//				entryCheck.emptyCheck(bosIndexStr);
//				entryCheck.negativeIntegerCheck(bosIndexStr);
//				entryCheck.emptyCheck(expIndexStr);
//				entryCheck.negativeIntegerCheck(expIndexStr);
//				
//			} catch (EntryIsEmptyException e) {
//				e.printStackTrace(System.out);					
//				System.out.println("EntryIsEmptyException has been caught");
//				continue;
//				
//			} catch (EntryIsNegativeIntegerException e){
//				e.printStackTrace(System.out);					
//				System.out.println("EntryIsNegativeNumberException has been caught");
//				continue;
//				
//			} catch (NumberFormatException e){
//				e.printStackTrace(System.out);	
//                System.out.println("NumberFormatException has been caught");
//                continue;	
//				
////			} catch (EntryIsNotAnIntegerException e){
////				e.printStackTrace(System.out);					
////				System.out.println("EntryIsNotAnIntegerException has been caught");	
////				
////			} catch (EntryIsNotANumberException e){
////				e.printStackTrace(System.out);					
////				System.out.println("EntryIsNotANumberException has been caught");	
//	
//			} finally {
//				System.out.println("All the possible Exceptions have been caught\n");
//
//			}				
//			
//			employeeIndex = Integer.parseInt(empIndexStr);
//			bossIndex = Integer.parseInt(bosIndexStr);
//			expiriencedApplicantIndex = Integer.parseInt(expIndexStr);
//			
//		} while((!isInteger(employeeIndex))&&(!isInteger(bossIndex))&&(!isInteger(expiriencedApplicantIndex)));					
//		in.nextLine();
		
		System.out.println("Enter the whole number of Employees");
		employeeIndex = in.nextInt();
		System.out.println("Enter the whole number of Bosses");
		bossIndex = in.nextInt();
		System.out.println("Enter the whole number of Expirienced Applicants");
		expiriencedApplicantIndex = in.nextInt();
		in.nextLine();		
		
		colleagueAr1.setListOfAllStaff(employee, employeeIndex, boss, bossIndex, expiriencedApplicant, expiriencedApplicantIndex);
		System.out.println(colleagueAr1.toString());
		
		System.out.println("====================================");
		do {
			System.out.println("Would you like to get all of the information about all of the Colleagues? (y/n)");
			index = in.nextLine();
			index = "y";
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(Staff staff : colleagueAr1.getListOfStaff()) {
					System.out.println(staff.toString());
					System.out.println("======");
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}				
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("====================================");
		
		String sexIndex = "";
		int indexColleague = 1;
		String ageIndex = "";
		String salaryIndex = "";
		
		do {
			System.out.println("Would you like to set data to all of the Colleagues? (y/n)");
			index = in.nextLine();		
		} while((!("y".equals(index)))&&(!("n".equals(index))));
				
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(Staff staff : colleagueAr1.getListOfStaff()) {
					
					System.out.println("colleague " + indexColleague);
					System.out.println(staff.toString());
					System.out.println("======");
					
					do {
						System.out.println("Set sex to colleague " + indexColleague  + " (" + staff.showStatus() + "): (f/m/trans)");
						sexIndex = in.nextLine();
					} while((!("f".equals(sexIndex)))&&(!("m".equals(sexIndex)))&&(!("trans".equals(sexIndex))));
					staff.setSex(sexIndex);
					
					System.out.println("Set age to colleague " + indexColleague  + " (" + staff.showStatus() + ")");
					ageIndex = in.nextLine();
					staff.setAge(Integer.parseInt(ageIndex));
					
					System.out.println("Set salary to colleague " + indexColleague + " (" + staff.showStatus() + ")");
					salaryIndex = in.nextLine();
					staff.setSalary(Integer.parseInt(salaryIndex));
					indexColleague++;
					System.out.println("======");
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("====================================");
		
		indexColleague = 1;
		
		do {
			System.out.println("Would you like to get all of the information about all of the Colleagues? (y/n)");
			index = in.nextLine();
			index = "y";
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(Staff staff : colleagueAr1.getListOfStaff()) {
					System.out.println("colleague " + indexColleague);
					System.out.println(staff.toString());
					System.out.println("======");
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}				
		} else {
			System.out.println("OK, move forward!");
		}
		
		indexColleague = 1;
		
		do {
			System.out.println("Would you like to put all of the information about all of the Colleagues to FILE? (y/n)");
			index = in.nextLine();
			index = "y";
		} while((!("y".equals(index)))&&(!("n".equals(index))));
		
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(Staff staff : colleagueAr1.getListOfStaff()) {
					ColleagueArrayProp colArProp = new ColleagueArrayProp();
//					String valueProp = colArProp.getValueFromProperties("mobile.properties","login");
//					System.out.println(valueProp);
//					valueProp = wrhp.getValueFromProperties("mobile.properties","password");
//					System.out.println(valueProp);
//					valueProp = wrhp.getValueFromProperties("mobile.properties","age");
//					System.out.println(valueProp);
					
					colArProp.setValueToProperties("mobile.properties","colleague", indexColleague);
					colArProp.setValueToProperties("mobile.properties","status", staff.showStatus());
					colArProp.setValueToProperties("mobile.properties","age", staff.showAge());
					colArProp.setValueToProperties("mobile.properties","sex", staff.showSex());
					colArProp.setValueToProperties("mobile.properties","salary", staff.showSalary());
					colArProp.setValueToProperties("mobile.properties","aquire", staff.aquire());
					colArProp.setValueToProperties("mobile.properties","work", staff.work());
					colArProp.setAllValuesToProperties("mobile.properties","colleague", indexColleague,"status", staff.showStatus(),"age", staff.showAge(),"sex", staff.showSex(),"salary", staff.showSalary(),"aquire", staff.aquire(),"work", staff.work());
					System.out.println("======");
					indexColleague++;
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}				
		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("====================================");
		System.out.println("THAT'S IT for Scanner_1_ArrayList_Colleague");
		System.out.println("====================================");	
		
}

		
	private boolean isInteger(int expiriencedApplicantIndex) {
		// TODO Auto-generated method stub
		return false;
	}
	


//	public void showColletionOperations() {	
//		
//		Scanner in = new Scanner(System.in);
//		String index = "";
//		
//		Employee employee1 = new Employee(25, "F"); 
//		employee1.setInfoAgain(26, "ff", 2000, "employee");
//		Employee employee2 = new Employee(20, "M"); 
//		Employee employee3 = new Employee(27, "F"); 
//		Boss boss1 = new Boss(76, "F"); 
//		boss1.setInfoAgain(46, "FF", 3000, "boss");
//		Boss boss2 = new Boss(77, "M"); 		
//		Boss boss3 = new Boss(75, "F"); 
//		ExpiriencedApplicant expiriencedApplicant1 = new ExpiriencedApplicant(56, "TransGender");
//		expiriencedApplicant1.setInfoAgain(16, "TransGender", 1500, "expirienced applicant");
//		ExpiriencedApplicant expiriencedApplicant2 = new ExpiriencedApplicant(77, "M");
//		ExpiriencedApplicant expiriencedApplicant3 = new ExpiriencedApplicant(44, "M");
//		
//		int employeeIndex = 0;
//		int bossIndex = 0;
//		int expiriencedApplicantIndex = 0;	
//		
//		System.out.println(" ");
//		System.out.println(" ");
//		System.out.println("================================Scanner_5_Collection_Colleague================================");
//		
//		
//		ColleagueColl colleagueColl1 = new ColleagueColl();
//		
//		do {	
//			System.out.println("Enter the number of Employees from 1 to 3");
//			employeeIndex = in.nextInt();
//		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
//	
//		do {	
//			System.out.println("Enter the number of Employees from 1 to 3");
//			bossIndex = in.nextInt();
//		} while((bossIndex != 1)&&(bossIndex != 2)&&(bossIndex != 3));
//		
//		do {	
//			System.out.println("Enter the number of Employees from 1 to 3");
//			expiriencedApplicantIndex = in.nextInt();
//		} while((expiriencedApplicantIndex != 1)&&(expiriencedApplicantIndex != 2)&&(expiriencedApplicantIndex != 3));
//		in.nextLine();
//		
//		switch (employeeIndex){
//		case 1:
//			colleagueColl1.setListOfEmployees(employee1);
//			break;
//		case 2:
//			colleagueColl1.setListOfEmployees(employee1);
//			colleagueColl1.setListOfEmployees(employee2);
//			break;
//		case 3:
//			colleagueColl1.setListOfEmployees(employee1);
//			colleagueColl1.setListOfEmployees(employee2);
//			colleagueColl1.setListOfEmployees(employee3);
//			break;	
//		default:
//			break;				
//		}
//		switch (bossIndex){
//		case 1:
//			colleagueColl1.setSetOfBosses(boss1);
//			break;
//		case 2:
//			colleagueColl1.setSetOfBosses(boss1);
//			colleagueColl1.setSetOfBosses(boss2);
//			break;
//		case 3:
//			colleagueColl1.setSetOfBosses(boss1);
//			colleagueColl1.setSetOfBosses(boss2);
//			colleagueColl1.setSetOfBosses(boss3);
//			break;	
//		default:
//			break;				
//		}
//		
//		switch (expiriencedApplicantIndex){
//		case 1:
//			colleagueColl1.setMapOfStaff(1, boss1);
//			break;
//		case 2:
//			colleagueColl1.setMapOfStaff(1, boss1);
//			colleagueColl1.setMapOfStaff(2, boss2);
//			break;
//		case 3:
//			colleagueColl1.setMapOfStaff(1, boss1);
//			colleagueColl1.setMapOfStaff(2, boss2);
//			colleagueColl1.setMapOfStaff(3, boss3);
//			break;	
//		default:
//			break;				
//		}
//		
//		
//		colleagueColl1.setListOfStaff(employee1);
//		colleagueColl1.setListOfStaff(boss1);
//		
//		colleagueColl1.setSetOfStaff(employee1);
//		colleagueColl1.setSetOfStaff(boss1);
//		
//		colleagueColl1.setMapOfStaff(31, employee1);
//		colleagueColl1.setMapOfStaff(32, employee2);
//		colleagueColl1.setMapOfStaff(33, employee3);
//		colleagueColl1.setMapOfStaff(21, boss1);
//		colleagueColl1.setMapOfStaff(22, boss2);
//		colleagueColl1.setMapOfStaff(23, boss3);
//
//		
//		System.out.println("========List_1,List_2,Set,List==========");
//		colleagueColl1.printInfoStorage(colleagueColl1.getListOfEmployees());
//		colleagueColl1.printInfoStorage(colleagueColl1.getListOfBadEmployees());
//		colleagueColl1.printInfoStorage(colleagueColl1.getSetOfBosses());
//		
//		System.out.println("======Sorting_of_List_with_Comparable=======");
//		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
//		Collections.sort(colleagueColl1.getListOfStaff());
//		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
//		
//		
//		System.out.println("======Sorting_of_Set_with_Comparable========");
//		colleagueColl1.printInfoStorage(colleagueColl1.getSetOfStaff());
//		Collections.sort(colleagueColl1.getListOfStaff());
//		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
//		
//		System.out.println("==========Sorting_of_Set_with_Treeset==========");
//		colleagueColl1.printInfoStorage(colleagueColl1.getSetOfStaff());	
//		colleagueColl1.getSortedSetOfStaff().addAll(colleagueColl1.getSetOfStaff()); 
//		colleagueColl1.printInfoStorage(colleagueColl1.getSortedSetOfStaff());	
//
//		
//		System.out.println("======Sorting_of_List_with_Comparator=======");
//		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
//		StatusCompare statusCompare = new StatusCompare();
//		Collections.sort(colleagueColl1.getListOfStaff(), statusCompare);
//		
//		SexCompare sexCompare = new SexCompare();
//		System.out.println("========================");
//		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
//		System.out.println("========================");
//		Collections.sort(colleagueColl1.getListOfStaff(), sexCompare);		
//		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
//		
//		
//		System.out.println("========================");
//		Iterator mapIterator = colleagueColl1.getMapOfStaff().entrySet().iterator();
//		while (mapIterator.hasNext()) {
//			System.out.println(mapIterator.next());
//			System.out.println("======");
//		}
//
//		colleagueColl1.getSortedMapOfStaff().putAll(colleagueColl1.getMapOfStaff()); 
//		
//		System.out.println("========================");
//		mapIterator = colleagueColl1.getSortedMapOfStaff().entrySet().iterator();
//		while (mapIterator.hasNext()) {
//			System.out.println(mapIterator.next());
//			System.out.println("======");
//		}
//		
//		colleagueColl1.printInfoSize1(colleagueColl1.getListOfStaff());
//		colleagueColl1.printInfoSize1(colleagueColl1.getListOfEmployees());
//		colleagueColl1.printInfoSize1(colleagueColl1.getListOfBadEmployees());
//		colleagueColl1.printInfoSize1(colleagueColl1.getSetOfBosses());
//		System.out.println("========================");
//		colleagueColl1.printInfoSize2(colleagueColl1.getListOfEmployees());
//		colleagueColl1.printInfoSize2(colleagueColl1.getSetOfBosses());
//		
//	}
		
}
		