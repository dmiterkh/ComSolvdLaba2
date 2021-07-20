package com.solvd.mobileoperator.user;

public class NoConnectionUser extends NoMoneyUser {
	
	public NoConnectionUser() {

	}

	public NoConnectionUser(int number, String operator, boolean isActive) {
		super(number,  operator, isActive);
	}	
	
	@Override
	public void printInfo() {
		System.out.println("NoConnectionUser number: " + super.getNumber());
		System.out.println("NoConnectionUser operator: " + super.getOperator());
		System.out.println("NoConnectionUser isActive: " + super.getStatus());
	}
	
	
	@Override
	public void printInfoAgain(int number, String operator, boolean isActive) {
		System.out.println("Again NoConnectionUser number: " + number);
		System.out.println("Again NoConnectionUser operator: " + operator);
		System.out.println("Again NoConnectionUser isActive: " + isActive);
	}
	
}