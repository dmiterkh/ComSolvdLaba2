package com.solvd.mobileoperator.user;

public class MobilePhoneUser extends GoodUser {

	protected int minutes;
	private String user = "Mobile Phone User";
	
	public MobilePhoneUser() {

	}

	public MobilePhoneUser(int number, String operator, boolean isActive, int minutes) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
		this.minutes = minutes;
	}

	public int getMinutes() {
		return this.minutes;
	}
	
	@Override
	public void printInfo() {
		System.out.println("MobileUser number: " + this.number);
		System.out.println("MobileUser operator: " + this.operator);
		System.out.println("MobileUser isActive: " + this.isActive);
		System.out.println("MobileUser minutes: " + this.minutes);
	}
	
	@Override
	public int showNumber() {
		return this.number;
	}
	
	@Override
	public String showOperator() {
		return this.operator;
	}
	
	@Override
	public boolean showStatus() {
		return this.isActive;
	}
	
	// OverLoading	
	public void printInfo(int number, String operator, boolean isActive ) {
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
				"My number of minutes is " + this.minutes;
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