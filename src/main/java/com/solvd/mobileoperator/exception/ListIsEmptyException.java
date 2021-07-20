package com.solvd.mobileoperator.exception;

public class ListIsEmptyException extends Exception{
	
	public ListIsEmptyException(){}
	
	public ListIsEmptyException(String message){
		super(message);
	}
	
    public ListIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}
