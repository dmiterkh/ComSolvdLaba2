package com.solvd.mobileoperator.exception;

public class EntryIsNotANumberException extends Exception{

	public EntryIsNotANumberException(){}
			
	public EntryIsNotANumberException(String message){
		super(message);
	}
		
    public EntryIsNotANumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
