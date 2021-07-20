package com.solvd.mobileoperator.storage;

import com.solvd.mobileoperator.staff.Staff;

import java.util.List;
import java.util.ArrayList;
//import java.util.LinkedList;

public class ColleagueAr {

	private List<Staff> listOfStaff;
	
	public ColleagueAr () {
		listOfStaff = new ArrayList<>();		
	}

	public void setListOfStaff(Staff staff) {
		listOfStaff.add(staff);		
	}	
	
	public List<Staff> getListOfStaff() {
		return listOfStaff;		
	}
	
	public void setListOfAllStaff(Staff staff1, int index1, Staff staff2, int index2, Staff staff3, int index3) {
		for (int i = 0; i < index1; i++) {
			listOfStaff.add(staff1);				
		}
		for (int i = index1; i < (index1 + index2); i++) {
			listOfStaff.add(staff1);				
		}
		for (int i = (index1 + index2); i < (index1 + index2 + index3); i++) {
			listOfStaff.add(staff1);				
		}
	}
}
