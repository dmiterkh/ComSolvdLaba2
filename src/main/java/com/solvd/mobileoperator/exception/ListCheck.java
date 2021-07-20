package com.solvd.mobileoperator.exception;

import com.solvd.mobileoperator.storage.ColleagueAr;

public class ListCheck {
	
	public void emptyCheck(ColleagueAr list) throws ListIsEmptyException {

		if (list.getListOfStaff().isEmpty()) {
			throw new ListIsEmptyException("ArrayList is empty!");
		}
	}
	
	public void nullCheck(ColleagueAr list) throws ListIsNullException {

		if (list == null) {
			throw new ListIsNullException("ArrayList is null!");
		}
	}	

}