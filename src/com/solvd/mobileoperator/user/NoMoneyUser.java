package com.solvd.mobileoperator.user;

public class NoMoneyUser extends BadUser {
	
	public NoMoneyUser() {

	}

	public NoMoneyUser(int number, String operator, boolean isActive) {
		super(number,  operator, isActive);
	}	
		
	@Override
	public void printInfo() {
		System.out.println("NoMoneyUser number: " + super.getNumber());
		System.out.println("NoMoneyUser operator: " + super.getOperator());
		System.out.println("NoMoneyUser isActive: " + super.getStatus());
	}
	
	@Override
	public int showNumber() {
		return super.getNumber();
	}
	
	@Override
	public String showOperator() {
		return super.getOperator();
	}
	
	@Override
	public boolean showStatus() {
		return super.getStatus();
	}
	
	@Override
	public void printInfoAgain(int number, String operator, boolean isActive) {
		System.out.println("Again NoMoneyUser number: " + number);
		System.out.println("Again NoMoneyUser operator: " + operator);
		System.out.println("Again NoMoneyUser isActive: " + isActive);
	}
	
	@Override
	public int showNumberAgain(int number) {
		return number; 
	}
	
	@Override
	public String showOperatorAgain(String operator) {
		return operator;
	}
	
	@Override
	public boolean showStatusAgain(boolean isActive) {
		return isActive;
	}
	
}
