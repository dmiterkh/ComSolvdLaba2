package com.solvd.mobileoperator.user;

public class HomeInternetUser extends HomePhoneUser {

	private int homeBonus;
	private String user = "Home Internet User";
	
	public HomeInternetUser() {

	}

	public HomeInternetUser(int number, String operator, boolean isActive, int homeBonus) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
		this.homeBonus = homeBonus;
	}

	public int getHomeBonus() {
		return this.homeBonus;
	}
	
	public void printInfo() {
		System.out.println("HomeInternetUser number: " +  this.number);
		System.out.println("HomeInternetUser operator: " + this.operator);
		System.out.println("HomeInternetUser isActive: " + this.isActive);
		System.out.println("HomeInternetUser homeBonus: " + this.homeBonus);
	}
	
	
	@Override
	public void showHomeBonus() {
		System.out.println("     HomeInternetUser homeBonus: " + this.homeBonus);
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
	public void printInfo(int number, String operator, boolean isActive) {
		System.out.println("Again HomeInternetUser number: " + number);
		System.out.println("Again HomeInternetUser operator: " + operator);
		System.out.println("Again HomeInternetUser isActive: " + isActive);
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
				"My home Bonus is " + this.homeBonus;
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
