package com.solvd.mobileoperator.exception;

public class EntryIsNegativeIntegerException extends Exception{
		
	public EntryIsNegativeIntegerException(){}
		
	public EntryIsNegativeIntegerException(String message){
		super(message);
	}
		
    public EntryIsNegativeIntegerException(String message, Throwable cause) {
        super(message, cause);
    }
}