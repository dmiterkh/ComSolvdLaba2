package com.solvd.mobileoperator.comparator;

import com.solvd.mobileoperator.staff.Staff;
import java.util.Comparator;

public class StatusCompare implements Comparator<Staff> {
	public int compare(Staff obj1, Staff obj2) {
		return obj1.showStatus().compareTo(obj2.showStatus());
	} 
}
