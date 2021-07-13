package com.solvd.mobileoperator.staff;

public class Boss extends Employee {

	private String status = "boss";
	private String power = "power";
	
	public Boss() {
		
	} 
	
	public Boss(int age, String sex) {
			this.age = age;
			this.sex = sex;
	} 
	
	@Override
	public String aquire() {
		return "I can aquire a lot of new skills!";
	}
	
	@Override
	public void printInfo() {
		System.out.println("I am a(an)_ "  + this.status);
		System.out.println("I am_  " + this.age + "  _years old");
		System.out.println("My sex is_ " + this.sex);		
		System.out.println("My salary is_ " + this.salary);		
		System.out.println("I have got_ "  + this.power);
		System.out.println("I can work 16 hours every day!");
		System.out.println("I can aquire a lot of skills!");
		System.out.println("I can hire people!");
		System.out.println("I can fire out people!");
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
	public void setInfoAgain(int age, String sex, int salary, String status /*, String power*/) {
		this.salary = salary;
		this.age = age;
		this.sex = sex;
		this.status = status;
/*	this.power = power;
*/
	}	
	
	@Override
	public double showSalaryMaximum(int age, int salary, String status /*, String power*/) {
		double salaryMaximum;
		double coefficient = 1;
		
		if (age < 30) {
			coefficient+=0.2;
		} else if (age < 50) {
			coefficient+=0.3;
		} else {
			coefficient+=0.1;
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
		
		if ("weak power".equals(this.power)) {
			coefficient+=0.1;
		} else if ("medium power".equals(this.power)) {
			coefficient+=0.2;
		} else if ("god power".equals(this.power)) {
			coefficient+=0.5;
		} 
		
		salaryMaximum = coefficient*salary;
		this.salary = (int) salaryMaximum;
		return salaryMaximum;
	}
	
	public int showSalary() {
		return this.salary;
	}
	
	// Overloading
	public void printInfo(int age, String sex, int salary, String status, String power) {
		System.out.println("I am a(an)_ "  + status);
		System.out.println("I am_  " + age + "  _years old");
		System.out.println("My sex is_ " + sex);		
		System.out.println("My salary is_ " + salary);		
		System.out.println("I have got_ "  + power);
		System.out.println("I can work 16 hours every day!");
		System.out.println("I can aquire a lot of skills!");
		System.out.println("I can hire people!");
		System.out.println("I can fire out people!");
	}
		
	//OverLoading
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
			
	//OverLoading
	public String showStatus(String status) {
		return status;
	}
	
	@Override
	public String work() {
		return "I can work 16 hours every day!";
		
	}
	
	//new method
	public String hirePeople() {
		return "I can hire people!";
	}
	
	//new method
	public String firePeople() {
		return "I can fire out people!";
	}
	
	@Override
	public String toString() {
		return "I am a(an)_ "  + this.status + "\n" + 
			   "I am_  " + this.age + "  _years old" + "\n" + 
			   "My sex is_ " + this.sex + "\n" + 
			   "My salary is_ " + this.salary + "\n" + 
			   this.aquire() + "\n" + 
			   this.work() + "\n" + 
			   this.hirePeople() + "\n" + 
			   this.firePeople();
	}
	
    @Override
    public boolean equals(Object obj) {
    	if (obj == this) {
    		return true;
    	}
    	if (obj == null || obj.getClass() != this.getClass()) {
    		return false;
    	}
		Boss boss = (Boss) obj; 
		return	((salary == boss.salary)&&(age == boss.age)&&(sex == boss.sex)&&(status == boss.status)&&(power == boss.power));
    }
    
    @Override
    public int hashCode() {
        int result = 29;     
        result = 31 * result + salary;
        result = 31 * result + age;
        result = 31 * result + (sex == null ? 0 : sex.hashCode());
        result = 31 * result + (status == null ? 0 : status.hashCode());               
        result = 31 * result + (power == null ? 0 : power.hashCode());
        return result;
    }
    
    @Override
    public int compareTo(Staff staff) {              
        return status.compareTo(staff.showStatus());
    }
}
