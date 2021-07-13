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
	
	public void setSex(String sex);

		
}
