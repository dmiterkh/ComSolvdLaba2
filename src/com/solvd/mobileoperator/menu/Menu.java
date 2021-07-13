package com.solvd.mobileoperator.menu;

//import com.solvd.mobileoperator.point.InternetMarket;         // Set, Get, Extension:  
//import com.solvd.mobileoperator.point.Market;         
//import com.solvd.mobileoperator.point.Office;         
//import com.solvd.mobileoperator.point.MarketPlace;    	
import com.solvd.mobileoperator.staff.Employee;               // Initial Interface Trainee, Extension, Implementation: 
import com.solvd.mobileoperator.staff.Boss;         		 
import com.solvd.mobileoperator.staff.ExpiriencedApplicant;   // Class ExpiriencedApplicant extends Abstract Class Unemployed and implements Interface Staff
//import com.solvd.mobileoperator.user.NoMoneyUser;             // Initial Abstract Class BadUser; 
//import com.solvd.mobileoperator.user.NoConnectionUser;   
//import com.solvd.mobileoperator.user.MobilePhoneUser;         // Initial Abstract Class GoodUser; 
//import com.solvd.mobileoperator.user.MobileInternetUser; 
//import com.solvd.mobileoperator.user.HomeInternetUser;    
import com.solvd.mobileoperator.storage.Colleague;            // Polymorphizm: Interface Staff Ar, Li, HS, HM
import com.solvd.mobileoperator.storage.ColleagueAr;
import com.solvd.mobileoperator.storage.ColleagueColl;
import com.solvd.mobileoperator.staff.Staff; 
import com.solvd.mobileoperator.comparator.StatusCompare;            // Polymorphizm: Interface Staff 
import com.solvd.mobileoperator.comparator.SexCompare;
//import com.solvd.mobileoperator.storage.ActiveUser;           // Polymorphizm: Abstract Class GoodUser
//import com.solvd.mobileoperator.storage.ActiveUserAr;
//import com.solvd.mobileoperator.storage.ActiveUserLi;
//import com.solvd.mobileoperator.user.GoodUser;


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
 



public class Menu {
	
	public Menu() {

	}	 
	
//	public void showTestCode() {	
//
//	}
	
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
		EntryCheck entryCheck = new EntryCheck ();	
		
		do {	
			
			String empIndexStr = "";
			String bosIndexStr = "";
			String expIndexStr = "";
			
			try {

				System.out.println("Enter the whole number of Employees");
				empIndexStr = in.nextLine();
				System.out.println("Enter the whole number of Bosses");
				bosIndexStr = in.nextLine();

				entryCheck.emptyCheck(empIndexStr);
				entryCheck.emptyCheck(bosIndexStr);
				entryCheck.negativeIntegerCheck(empIndexStr);
				entryCheck.negativeIntegerCheck(bosIndexStr);

				
			} catch (EntryIsEmptyException e) {
				e.printStackTrace(System.out);					
				System.out.println("EntryIsEmptyException has been caught");
				continue;
				
			} catch (EntryIsNegativeIntegerException e){
				e.printStackTrace(System.out);					
				System.out.println("EntryIsNegativeNumberException has been caught");
				continue;
				
			} catch (NumberFormatException e){
				e.printStackTrace(System.out);	
                System.out.println("NumberFormatException has been caught");
                continue;	
				
//			} catch (EntryIsNotAnIntegerException e){
//				e.printStackTrace(System.out);					
//				System.out.println("EntryIsNotAnIntegerException has been caught");	
//				
//			} catch (EntryIsNotANumberException e){
//				e.printStackTrace(System.out);					
//				System.out.println("EntryIsNotANumberException has been caught");	
	
			} finally {
				System.out.println("All the possible Exceptions have been caught\n");
			}	
			
			
 
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the whole number of Expirienced Applicants");
			try {
				expIndexStr = reader.readLine();
				entryCheck.emptyCheck(expIndexStr);
				entryCheck.negativeIntegerCheck(expIndexStr);
			
			} catch (EntryIsEmptyException e) {
				e.printStackTrace(System.out);					
				System.out.println("EntryIsEmptyException has been caught");
				continue;
			
			} catch (EntryIsNegativeIntegerException e){
				e.printStackTrace(System.out);					
				System.out.println("EntryIsNegativeNumberException has been caught");
				continue;
			
			} catch (NumberFormatException e){
				e.printStackTrace(System.out);	
				System.out.println("NumberFormatException has been caught");
				continue;	
		
			
//			System.out.println(expIndexStr);
			} catch (IOException e){
				System.out.println(e.getMessage());
			
			} finally {
				try{
					reader.close();
				} catch (IOException e){
					System.out.println(e.getMessage());
				}
			}
		

		} while((!isInteger(employeeIndex))&&(!isInteger(bossIndex))&&(!isInteger(expiriencedApplicantIndex)));					
		in.nextLine();
		

     

				
				

		
		colleagueAr1.setListOfAllStaff(employee, employeeIndex, boss, bossIndex, employee, expiriencedApplicantIndex);
		
		ColleagueAr colleagueAr2 = new ColleagueAr();
		ColleagueAr colleagueAr3 = new ColleagueAr();
		colleagueAr3 = null;
		
		do {
			System.out.println("Would you like to get all of the information about all of the Employees? (y/n)");
			index = in.nextLine();
		} while((!("y".equals(index)))&&(!("n".equals(index))));		
      
		if ("y".equals(index)) {
			ListCheck listCheck = new ListCheck ();
			
			try {
				listCheck.nullCheck(colleagueAr3);
				listCheck.emptyCheck(colleagueAr3);
			} catch (ListIsNullException e) {
				e.printStackTrace(System.out);					
				System.out.println("ListIsNullException has been caught");				
			} catch (ListIsEmptyException e) {
				e.printStackTrace(System.out);					
				System.out.println("ListIsEmptyException has been caught");					
			} finally {
				System.out.println("All the possible Exceptions have been caught\n");
			}	
			
			for(int i = 0; i < employeeIndex; i++) {
				System.out.println(colleagueAr3.getListOfStaff().get(i).toString());
				System.out.println("======");
			}
			
 		} else {
			System.out.println("OK, move forward!");
		}
		
		System.out.println("====================================");
		
		String sexIndex = "";
		int indexSex = 1;
		
		do {
			System.out.println("Would you like to set sex to all of the Employees? (y/n)");
			index = in.nextLine();		
		} while((!("y".equals(index)))&&(!("n".equals(index))));
				
		if ("y".equals(index)) {
			if ((colleagueAr1 != null)&&(!colleagueAr1.getListOfStaff().isEmpty())) {
				for(int i = 0; i < employeeIndex; i++) {
					do {
						System.out.println("Sex of " + colleagueAr1.getListOfStaff().get(i).showStatus() + " " + indexSex + " is " + colleagueAr1.getListOfStaff().get(i).showSex());
						System.out.println("Set sex to " + colleagueAr1.getListOfStaff().get(i).showStatus() + " " + indexSex + " (f/m/trans)");
						sexIndex = in.nextLine();
					} while((!("f".equals(sexIndex)))&&(!("m".equals(sexIndex)))&&(!("trans".equals(sexIndex))));
					colleagueAr1.getListOfStaff().get(i).setSex(sexIndex);
				}
			} else {
				System.out.println("The required Storage is Null or Empty");	
			}
		} else {
			System.out.println("OK, move forward!");
		}
		
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
		System.out.println("THAT'S IT for Scanner_1_ArrayList_Colleague");
		System.out.println("====================================");	
		
}

		
	
	
	private boolean isInteger(int expiriencedApplicantIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	public void showColletionOperations() {	
		
		Scanner in = new Scanner(System.in);
		String index = "";
		
		Employee employee1 = new Employee(25, "F"); 
		employee1.setInfoAgain(26, "ff", 2000, "employee");
		Employee employee2 = new Employee(20, "M"); 
		Employee employee3 = new Employee(27, "F"); 
		Boss boss1 = new Boss(76, "F"); 
		boss1.setInfoAgain(46, "FF", 3000, "boss");
		Boss boss2 = new Boss(77, "M"); 		
		Boss boss3 = new Boss(75, "F"); 
		ExpiriencedApplicant expiriencedApplicant1 = new ExpiriencedApplicant(56, "TransGender");
		expiriencedApplicant1.setInfoAgain(16, "TransGender", 1500, "expirienced applicant");
		ExpiriencedApplicant expiriencedApplicant2 = new ExpiriencedApplicant(77, "M");
		ExpiriencedApplicant expiriencedApplicant3 = new ExpiriencedApplicant(44, "M");
		
		int employeeIndex = 0;
		int bossIndex = 0;
		int expiriencedApplicantIndex = 0;	
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("================================Scanner_5_Collection_Colleague================================");
		
		
		ColleagueColl colleagueColl1 = new ColleagueColl();
		
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			employeeIndex = in.nextInt();
		} while((employeeIndex != 1)&&(employeeIndex != 2)&&(employeeIndex != 3));
	
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			bossIndex = in.nextInt();
		} while((bossIndex != 1)&&(bossIndex != 2)&&(bossIndex != 3));
		
		do {	
			System.out.println("Enter the number of Employees from 1 to 3");
			expiriencedApplicantIndex = in.nextInt();
		} while((expiriencedApplicantIndex != 1)&&(expiriencedApplicantIndex != 2)&&(expiriencedApplicantIndex != 3));
		in.nextLine();
		
		switch (employeeIndex){
		case 1:
			colleagueColl1.setListOfEmployees(employee1);
			break;
		case 2:
			colleagueColl1.setListOfEmployees(employee1);
			colleagueColl1.setListOfEmployees(employee2);
			break;
		case 3:
			colleagueColl1.setListOfEmployees(employee1);
			colleagueColl1.setListOfEmployees(employee2);
			colleagueColl1.setListOfEmployees(employee3);
			break;	
		default:
			break;				
		}
		switch (bossIndex){
		case 1:
			colleagueColl1.setSetOfBosses(boss1);
			break;
		case 2:
			colleagueColl1.setSetOfBosses(boss1);
			colleagueColl1.setSetOfBosses(boss2);
			break;
		case 3:
			colleagueColl1.setSetOfBosses(boss1);
			colleagueColl1.setSetOfBosses(boss2);
			colleagueColl1.setSetOfBosses(boss3);
			break;	
		default:
			break;				
		}
		
		switch (expiriencedApplicantIndex){
		case 1:
			colleagueColl1.setMapOfStaff(1, boss1);
			break;
		case 2:
			colleagueColl1.setMapOfStaff(1, boss1);
			colleagueColl1.setMapOfStaff(2, boss2);
			break;
		case 3:
			colleagueColl1.setMapOfStaff(1, boss1);
			colleagueColl1.setMapOfStaff(2, boss2);
			colleagueColl1.setMapOfStaff(3, boss3);
			break;	
		default:
			break;				
		}
		
		
		colleagueColl1.setListOfStaff(employee1);
		colleagueColl1.setListOfStaff(boss1);
		
		colleagueColl1.setSetOfStaff(employee1);
		colleagueColl1.setSetOfStaff(boss1);
		
		colleagueColl1.setMapOfStaff(31, employee1);
		colleagueColl1.setMapOfStaff(32, employee2);
		colleagueColl1.setMapOfStaff(33, employee3);
		colleagueColl1.setMapOfStaff(21, boss1);
		colleagueColl1.setMapOfStaff(22, boss2);
		colleagueColl1.setMapOfStaff(23, boss3);

		
		System.out.println("========List_1,List_2,Set,List==========");
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfEmployees());
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfBadEmployees());
		colleagueColl1.printInfoStorage(colleagueColl1.getSetOfBosses());
		
		System.out.println("======Sorting_of_List_with_Comparable=======");
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		Collections.sort(colleagueColl1.getListOfStaff());
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		
		
		System.out.println("======Sorting_of_Set_with_Comparable========");
		colleagueColl1.printInfoStorage(colleagueColl1.getSetOfStaff());
		Collections.sort(colleagueColl1.getListOfStaff());
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		
		System.out.println("==========Sorting_of_Set_with_Treeset==========");
		colleagueColl1.printInfoStorage(colleagueColl1.getSetOfStaff());	
		colleagueColl1.getSortedSetOfStaff().addAll(colleagueColl1.getSetOfStaff()); 
		colleagueColl1.printInfoStorage(colleagueColl1.getSortedSetOfStaff());	

		
		System.out.println("======Sorting_of_List_with_Comparator=======");
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		StatusCompare statusCompare = new StatusCompare();
		Collections.sort(colleagueColl1.getListOfStaff(), statusCompare);
		
		SexCompare sexCompare = new SexCompare();
		System.out.println("========================");
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		System.out.println("========================");
		Collections.sort(colleagueColl1.getListOfStaff(), sexCompare);		
		colleagueColl1.printInfoStorage(colleagueColl1.getListOfStaff());
		
		
		System.out.println("========================");
		Iterator mapIterator = colleagueColl1.getMapOfStaff().entrySet().iterator();
		while (mapIterator.hasNext()) {
			System.out.println(mapIterator.next());
			System.out.println("======");
		}

		colleagueColl1.getSortedMapOfStaff().putAll(colleagueColl1.getMapOfStaff()); 
		
		System.out.println("========================");
		mapIterator = colleagueColl1.getSortedMapOfStaff().entrySet().iterator();
		while (mapIterator.hasNext()) {
			System.out.println(mapIterator.next());
			System.out.println("======");
		}
		
		colleagueColl1.printInfoSize1(colleagueColl1.getListOfStaff());
		colleagueColl1.printInfoSize1(colleagueColl1.getListOfEmployees());
		colleagueColl1.printInfoSize1(colleagueColl1.getListOfBadEmployees());
		colleagueColl1.printInfoSize1(colleagueColl1.getSetOfBosses());
		System.out.println("========================");
		colleagueColl1.printInfoSize2(colleagueColl1.getListOfEmployees());
		colleagueColl1.printInfoSize2(colleagueColl1.getSetOfBosses());
		
	}
		
}
		