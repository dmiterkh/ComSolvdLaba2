package com.solvd.mobileoperator.user;

public abstract class GoodUser {

	protected int number;
	protected String operator;
	protected boolean isActive = true;

	public GoodUser() {

	}

	public GoodUser(int number, String operator, boolean isActive) {
		this.number = number;
		this.operator = operator;
		this.isActive = isActive;
	}
	
	public abstract void printInfo();
	
	public abstract int showNumber();
	
	public abstract String showOperator();
	
	public abstract boolean showStatus();
	
	// OverLoading		
	public abstract void printInfo(int number, String operator, boolean isActive);

	// OverLoading		
	public abstract int showNumber(int number);
	
	// OverLoading		
	public abstract String showOperator(String operator);
	
	// OverLoading		
	public abstract boolean showStatus(boolean isActive);
	
	public int getNumber() {
		return this.number;
	}
	
	public String getOperator() {
		return this.operator;
	}
	
	public boolean getStatus() {
		return this.isActive;
	}
	
	public abstract void setOperator(String operator);
	
	public abstract String showUser();
	
}

