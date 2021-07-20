package com.solvd.mobileoperator.point;

//Shop for sales only

public class Market extends InternetMarket {
	
	private String adress; 

	public Market() {	

	}

	public Market(String adress, boolean sales){
		if (adress.isEmpty()) {
			System.out.println("Error in field 'adress' ");
		} else { 
			this.adress = adress;
		}		

		this.sales = sales;		
	}	
	
	public void setInfo(String adress, boolean sales){
		if (adress.isEmpty()) {
			System.out.println("Error in field 'adress' ");
		} else { 
			this.adress = adress;
		}				

		this.sales = sales;		
	}

	public void printInfo(){
		System.out.println("adress = " + this.adress);
		System.out.println("sales = " + this.sales);
	}

	public void setAdress(String adress){
		if (adress.isEmpty()) {
			System.out.println("Error in field 'adress' ");
		} else { 
			this.adress = adress;
		}
	} 

	public String getAdress(){
		return this.adress;
	} 
	
}
