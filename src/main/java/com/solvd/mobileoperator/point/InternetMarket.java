package com.solvd.mobileoperator.point;

//Internet Shop for sales only

public class InternetMarket {
	
	protected boolean sales;
	
	public InternetMarket() {

	}	
		
	public InternetMarket(boolean sales) {
		this.sales = sales;			
	}
	
	public void setInfo(boolean sales) {
		this.sales = sales;
	}	
		
	public void printInfo() {
		System.out.println("sales = " + this.sales);
	}
	
	public void setSales(boolean sales) {
		this.sales = sales;
	}	
		
	public boolean getSales() {
		return this.sales;
	}	
	
}