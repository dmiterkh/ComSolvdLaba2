package com.solvd.mobileoperator.staff;

import java.lang.Object;
//import com.google.common.base.Objects.hashCode;
//import java.util.Objects.hash;

public class Employee implements Staff {

	protected int salary;
	protected int age; 
	protected String sex; 
	private String status = "employee"; 
		
	public Employee() {
		
	} 
	
	public Employee(int age, String sex) {
		this.age = age;
		this.sex = sex;
	} 
		
	@Override
	public String aquire() {
		return "I can aquire new skills!";
	}
	
	@Override
	public void printInfo() {
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("My salary is_ " + this.salary);		
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
	public void setInfoAgain(int age, String sex, int salary, String status) {
		this.salary = salary;
		this.age = age;
		this.sex = sex;
		this.status = status;
	}
	
	@Override
	public double showSalaryMaximum(int age, int salary, String status) {
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
		
		salaryMaximum = coefficient*salary;
		this.salary = (int) salaryMaximum;
		return salaryMaximum;
	}
	
	public int showSalary() {
		return this.salary;
	}
	
	// Overloading
	public void printInfo(int age, String sex, int salary, String status) {
		System.out.println("I am a(an)_ "  + status);
		System.out.println("I am_  " + age + "  _years old");
		System.out.println("My sex is_ " + sex);		
		System.out.println("My salary is_ " + salary);		
		System.out.println("I can work 8 hours every day!");
		System.out.println("I can aquire new skills!");
	}
	
	// Overloading
	public void printInfo(int age, String sex) {
		System.out.println(age);
		System.out.println(sex);
	}
	
	//OverLoading
	public int showAge(int age) { 
		return age;
	}
	
	//OverLoading
	public String showSex(String sex) {
		return sex;
	}
	
	// Overloading
	public String showStatus(String status) {
		return status;
	}
	
	@Override
	public void setSex(String sex) {
		this.sex = sex;	
	}
	
	@Override
	public String work() {
		return "I can work 8 hours every day!";
	}

	@Override
	public String toString() {
		return "I am a(an)_ "  + this.status + "\n" + 
			   "I am_  " + this.age + "  _years old" + "\n" + 
			   "My sex is_ " + this.sex + "\n" + 
			   "My salary is_ " + this.salary + "\n" + 
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
