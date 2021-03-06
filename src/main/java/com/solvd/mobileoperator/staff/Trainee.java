package com.solvd.mobileoperator.staff;

public interface Trainee {

	public String aquire();	
	
	public void printInfo();
	
	public int showAge();
	
	public String showSex();
	
	public String showStatus();
	
	public void setInfoAgain(int age, String sex, int salary, String status);
	
	public double showSalaryMaximum(int age, int salary, String status);
	
	public int showSalary();
	
//OverLoading
	public void printInfo(int age, String sex);
	
//OverLoading
	public int showAge(int age);
	
//OverLoading	
	public String showSex(String sex);
	
//OverLoading
	public String showStatus(String status);

	public void setId(int id);
	
	public void setAge(int age);	
	
	public void setSex(String sex);
	
	public void setSalary(int age);
	
	public void setStatus(String status);
	
	public int getId();

	public int getAge();
	
	public String getSex();
	
	public int getSalary();
	
	public String getStatus();
		
}
