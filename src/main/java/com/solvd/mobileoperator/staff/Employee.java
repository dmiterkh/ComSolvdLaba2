package com.solvd.mobileoperator.staff;

import java.lang.Object;
import org.apache.log4j.Logger;
import com.solvd.mobileoperator.utils.*;
//import com.google.common.base.Objects.hashCode;
//import java.util.Objects.hash;

public class Employee implements Staff {

	private final static Logger LOGGER = Logger.getLogger(Animal.class);
	
	protected int salary;
	protected int age; 
	protected String sex; 
	private String status = "employee"; 
		
	public Employee() {
		
	} 
	
	public Employee(int ageArg, String sexArg) {
		age = ageArg;
		sex = sexArg;
	} 
		
	@Override
	public String aquire() {
		return "I can aquire new skills!";
	}
	
	@Override
	public void printInfo() {
		System.out.println("I am a(an)_ "  + status);
		System.out.println("I am_  " + age + "  _years old");
		System.out.println("My sex is_ " + sex);		
		System.out.println("My salary is_ " + salary);		
		System.out.println("I can work 8 hours every day!");
		System.out.println("I can aquire new skills!");
	}	
	
	@Override
	public int showAge() {
		return this.age;
	}
	
	@Override
	public String showSex() {
		return this.sex;
	}
	
	@Override
	public String showStatus() {
		return this.status;
	}
	
	@Override
	public void setInfoAgain(int ageArg, String sexArg, int salaryArg, String statusArg) {
		salary = salaryArg;
		age = ageArg;
		sex = sexArg;
		status = statusArg;
	}
	
	@Override
	public double showSalaryMaximum(int ageArg, int salaryArg, String statusArg) {
		double salaryMaximum;
		double coefficient = 1.0;
		
		if (age < 30) {
			coefficient += 0.2;
		} else if (age < 50) {
			coefficient += 0.3;
		} else {
			coefficient += 0.1;
		}
		
		if ("expirienced applicant".equals(status)) {
			coefficient+=0.2;
		} else if ("employee".equals(status)) {
			coefficient+=0.3;
		} else if ("boss".equals(status)) {
			coefficient+=0.4;
		} else if ("bad employee".equals(status)) {
			coefficient+=0.1;
		}
		
		salaryMaximum = coefficient*salaryArg;
		salary = (int) salaryMaximum;
		return salaryMaximum;
	}
	
	public int showSalary() {
		return salary;
	}
	
	// Overloading
	public void printInfo(int ageArg, String sexArg, int salaryArg, String statusArg) {
		System.out.println("I am a(an)_ "  + statusArg);
		System.out.println("I am_  " + ageArg + "  _years old");
		System.out.println("My sex is_ " + sexArg);		
		System.out.println("My salary is_ " + salaryArg);		
		System.out.println("I can work 8 hours every day!");
		System.out.println("I can aquire new skills!");
	}
	
	// Overloading
	public void printInfo(int ageArg, String sexArg) {
		System.out.println(ageArg);
		System.out.println(sexArg);
	}
	
	//OverLoading
	public int showAge(int ageArg) { 
		return ageArg;
	}
	
	//OverLoading
	public String showSex(String sexArg) {
		return sexArg;
	}
	
	// Overloading
	public String showStatus(String statusArg) {
		return statusArg;
	}
	
	@Override
	public void setSex(String sexArg) {
		sex = sexArg;	
	}
	
	@Override
	public void setAge(int ageArg) {
		age = ageArg;	
	}
	
	@Override
	public void setSalary(int salaryArg) {
		salary = salaryArg;	
	}
	
	@Override
	public String work() {
		return "I can work 8 hours every day!";
	}

	@Override
	public String toString() {
		return "I am a(an)_ "  + status + "\n" + 
			   "I am_  " + age + "  _years old" + "\n" + 
			   "My sex is_ " + sex + "\n" + 
			   "My salary is_ " + salary + "\n" + 
			   this.aquire() + "\n" + 
			   this.work();
	}
	
    @Override
    public boolean equals(Object obj) {
    	if (obj == this) {
    		return true;
    	}
    	if (obj == null || obj.getClass() != this.getClass()) {
    		return false;
    	}
		Employee employee = (Employee) obj; 
		return	((salary == employee.salary)&&(age == employee.age)&&(sex == employee.sex)&&(status == employee.status));
    }
    
//    @Override
//    public int hashCode() {
//        int h = hash;
//        if (h == 0 && value.length > 0) {
//			char val[] = value;
//		
//			for (int i = 0; i < value.length; i++) {
//				h = 31 * h + val[i];
//			}	
//            hash = h; 
//        }
//        return h;
//    }
    
    @Override
    public int hashCode() {
        int result = 29;     
        result = 31 * result + salary;
        result = 31 * result + age;
        result = 31 * result + (sex == null ? 0 : sex.hashCode());
        result = 31 * result + (status == null ? 0 : status.hashCode());               
        return result;
    }
    
    @Override
    public int compareTo(Staff staff) {              
        return status.compareTo(staff.showStatus());
    }
    
}

