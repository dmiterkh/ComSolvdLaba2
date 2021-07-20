package com.solvd.mobileoperator.user;

public class MobileInternetUser extends MobilePhoneUser {

	private int bytes;
	private String user = "Mobile Internet User";
	
	public MobileInternetUser() {

	}

	public MobileInternetUser(int number, String operator, boolean isActive, int minutes, int bytes) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
		this.minutes = minutes;
		this.bytes = bytes;	
	}
	
	public int getBytes() {
		return this.bytes;
	}

	@Override
	public void printInfo() {
		System.out.println("MobileInternetUser number: " + getNumber());
		System.out.println("MobileInternetUser operator: " + getOperator());
		System.out.println("MobileInternetUser isActive: " + getStatus());
		System.out.println("MobileInternetUser minutes: " + getMinutes());
		System.out.println("MobileInternetUser bytes: " + getBytes());
	}
	
	// OverLoading	
	public void printInfo(int number, String operator, boolean isActive) {
		System.out.println("Again MobileUser number: " + number);
		System.out.println("Again MobileUser operator: " + operator);
		System.out.println("Again MobileUser isActive: " + isActive);
	}
	
	// OverLoading
	public int showNumber(int number) {
		return number;
	}
	
	// OverLoading	
	public String showOperator(String operator) {
		return operator;
	}
	
	// OverLoading	
	public boolean showStatus(boolean isActive) {
		return isActive;
	}
	
	public String toString() {
		return 	"I am a " +  this.user + "\n" +
				"My number is " +  this.number + "\n" + 
				"My operator is " + this.operator + "\n" + 
				"My status of activity is " + this.isActive + "\n" + 
				"My number of minutes is " + this.minutes + "\n" + 
				"My number of bytes is " + this.bytes;
	}
	
	@Override
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	@Override
	public String showUser() {
		return this.user;
	}
}
