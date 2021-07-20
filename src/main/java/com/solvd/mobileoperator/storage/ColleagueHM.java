package com.solvd.mobileoperator.storage;

import com.solvd.mobileoperator.staff.Staff;

import java.util.Map;
import java.util.HashMap;

public class ColleagueHM {

	Map<Integer, Staff>  mapOfStaff;
	
	public ColleagueHM () {
		mapOfStaff = new HashMap<Integer, Staff>();	
	}

	public void setMapOfStaff(int number, Staff staff) {
		mapOfStaff.put(number, staff);		
	}	
		
	public Map<Integer, Staff> getMapOfStaff() {
		return mapOfStaff;		
	}
}