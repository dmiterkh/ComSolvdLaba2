package com.solvd.mobileoperator.storage;

import com.solvd.mobileoperator.staff.Staff;

import java.util.List;
//import java.util.ArrayList;
import java.util.LinkedList;

public class ColleagueLi {

	private List<Staff> listOfStaff;
	
	public ColleagueLi () {
		listOfStaff = new LinkedList<>();		
	}

	public void setListOfStaff(Staff staff) {
		listOfStaff.add(staff);		
	}	
		
	public List<Staff> getListOfStaff() {
		return listOfStaff;		
	}
}