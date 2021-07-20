package com.solvd.mobileoperator.user;

public abstract class HomePhoneUser extends GoodUser {

	public HomePhoneUser() {

	}

	public HomePhoneUser(int number, String operator, boolean isActive) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
	}
	
	public abstract void showHomeBonus();

	@Override
	public void printInfo() {
		System.out.println("HomeInternetUser number:  " +  this.number);
		System.out.println("HomeInternetUser operator:  " + this.operator);
		System.out.println("HomeInternetUser isActive:  " + this.isActive);
	}

	// OverLoading	
	@Override
	public void printInfo(int number, String operator, boolean isActive) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
		System.out.println("Again MobileUser number: " + this.number);
		System.out.println("Again MobileUser operator: " + this.operator);
		System.out.println("Again MobileUser isActive: " + this.isActive);
	}
	
	// OverLoading	
	@Override
	public int showNumber(int number) {
		this.number = number;
		return this.number;
	}
	
	// OverLoading	
	@Override
	public String showOperator(String operator) {
		this.operator = operator;
		return this.operator;
	}
	
	// OverLoading	
	@Override
	public boolean showStatus(boolean isActive) {
		this.isActive = isActive;
		return this.isActive;
	}

	
}