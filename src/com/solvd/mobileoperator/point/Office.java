package com.solvd.mobileoperator.point;

//Office for services only

public class Office {

	protected String adress;
	protected String priority;
	protected int number;
			
	public Office() {
		
	}
	
	public Office(String adress, String priority, int number) {
		if (adress.isEmpty()){
			System.out.println("Error in field 'adress'  ");
		} else { 
			this.adress = adress;
		}	
		
		if (priority.isEmpty()){
			System.out.println("Error in field 'priority'  ");
		} else { 
			this.priority = priority;
		}
		
		if (number <= 0){
			System.out.println("Error in field number ");
		} else { 
			this.number = number;
		}
	}	

	public void setInfo(String adress, String priority, int number) {
		if (adress.isEmpty()){
			System.out.println("Error in field 'adress' ");
		} else { 
			this.adress = adress;
		}	
		
		if (priority.isEmpty()){
			System.out.println("Error in field 'priority' ");
		} else { 
			this.priority = priority;
		}
		
		if (number <= 0){
			System.out.println("Error in field number");
		} else { 
			this.number = number;
		}
	}
	
	public void printInfo() {
		System.out.println("Adress = " + this.adress);
		System.out.println("Priority = " + this.priority);		
		System.out.println("number = " + this.number);
	}

	public void setAdress(String adress) {
		if (adress.isEmpty()){
			System.out.println("Error in field 'adress' ");
		} else { 
			this.adress = adress;
		}			
	}
	
	public String getAdress() {
		return this.adress;
	}
		
	public void setPriority(String priority) {
		if (priority.isEmpty()){
			System.out.println("Error in field 'priority' ");
		} else { 
			this.priority = priority;
		}
	}
	
	public String getPriority() {
		return this.priority;
	}
	
	public void setNumber(int number) {
		if (number <= 0){
			System.out.println("Error in field number");
		} else { 
			this.number = number;
		}
	}
	
	public int getNumber() {
		return this.number;
	}
	
}

