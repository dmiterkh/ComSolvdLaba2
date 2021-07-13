package com.solvd.mobileoperator.exception;

public class EntryIsEmptyException extends Exception{

	public EntryIsEmptyException(){}
	
	public EntryIsEmptyException(String message){
		super(message);
	}
	
    public EntryIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}
