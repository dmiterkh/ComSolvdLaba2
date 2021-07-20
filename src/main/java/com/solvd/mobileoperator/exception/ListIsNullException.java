package com.solvd.mobileoperator.exception;

public class ListIsNullException extends Exception{

	public ListIsNullException(){}
	
	public ListIsNullException(String message){
		super(message);
	}
	
    public ListIsNullException(String message, Throwable cause) {
        super(message, cause);
    }
}
