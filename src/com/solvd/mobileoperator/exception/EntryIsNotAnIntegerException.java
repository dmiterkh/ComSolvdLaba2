package com.solvd.mobileoperator.exception;

public class EntryIsNotAnIntegerException extends Exception{

	public EntryIsNotAnIntegerException(){}
			
	public EntryIsNotAnIntegerException(String message){
		super(message);
	}
		
    public EntryIsNotAnIntegerException(String message, Throwable cause) {
        super(message, cause);
    }
}