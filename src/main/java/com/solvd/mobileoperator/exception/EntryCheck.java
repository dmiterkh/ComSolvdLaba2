package com.solvd.mobileoperator.exception;

import java.util.*;

public class EntryCheck {
	
	public void negativeIntegerCheck(String str) throws EntryIsNegativeIntegerException {
		int number = Integer.parseInt(str);
		if (number < 0) {
			throw new EntryIsNegativeIntegerException("Entry is a negative integer!");
		}
	}
	
//	public void notAnIntegerCheck(String str) throws EntryIsNotAnIntegerException {
//		int number = Integer.parseInt(str);
//		if (!isInteger(number)) {
//			throw new EntryIsNotAnIntegerException("Entry is not an integer!");
//		}
//	}

//
//	public void notANumberCheck(String str) throws EntryIsNotANumberException {
//
//		if () {
//			throw new EntryIsNotANumberException("Entry is not a number!");
//		}
//	}
//
	public void emptyCheck(String str) throws EntryIsEmptyException {

		if (str.isEmpty()) {
			throw new EntryIsEmptyException("Entry is empty!");
		}
	}
	
}