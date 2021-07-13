package com.solvd.mobileoperator.point;

//Shop for sales and services

public class MarketPlace extends Office {
		
	private boolean sales; 
		
	public MarketPlace() {

	}	
		
	public MarketPlace(String adress, String priority, int number, boolean sales) {
		if (adress.isEmpty()) {
			System.out.println("Error in field 'adress' ");
		} else { 
			this.adress = adress;
		}	
		
		if (priority.isEmpty()) {
			System.out.println("Error in field 'priority' ");
		} else { 
			this.priority = priority;
		}
		
		if (number <= 0) {
			System.out.println("Error in field number");
		} else { 
			this.number = number;
		}	
		
		this.sales = sales;			
	}		
					
	//Unable to make setInfoPoint() function due to different number of parameters. 
	// Is there any possibilities to make it?
		
	public void setInfo(String adress, String priority, int number, boolean sales) {
		if (adress.isEmpty()) {
			System.out.println("Error in field 'adress' ");
		} else { 
			this.adress = adress;
		}	
		
		if (priority.isEmpty()) {
			System.out.println("Error in field 'priority' ");
		} else { 
			this.priority = priority;
		}
		
		if (number <= 0) {
			System.out.println("Error in field number");
		} else { 
			this.number = number;
		}		
		
		this.sales = sales;
	}
		
	@Override
	public void printInfo() {
		System.out.println("Adress = " + this.adress);
		System.out.println("Priority = " + this.priority);		
		System.out.println("number = " + this.number);
		System.out.println("sales = " + this.sales);
	}
		
	public void setSales(boolean sales) {
		this.sales = sales;
	}	
				
	public boolean getSales() {
		return this.sales;
	}	
	
}
