package com.solvd.mobileoperator.storage;

import com.solvd.mobileoperator.staff.Staff;

import java.util.Set;
import java.util.HashSet;

public class ColleagueHS {

	Set<Staff>  setOfStaff;
	
	public ColleagueHS () {
		setOfStaff = new HashSet<Staff>();	
	}

	public void setSetOfStaff(Staff staff) {
		setOfStaff.add(staff);		
	}	
		
	public Set<Staff> getSetOfStaff() {
		return setOfStaff;		
	}
}