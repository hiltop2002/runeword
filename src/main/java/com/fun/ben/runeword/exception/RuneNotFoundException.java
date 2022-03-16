package com.fun.ben.runeword.exception;

public class RuneNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String requestParam;
	
	public RuneNotFoundException(String message)
	{
		super();	
		this.requestParam=message;
	}
	
	public String getLocalizedMessage()
	{
		return this.requestParam;
	}

}
