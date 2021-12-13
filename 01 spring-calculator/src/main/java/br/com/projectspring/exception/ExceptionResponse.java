package br.com.projectspring.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Date times;
	private String message;
	private String details;
	
	
	public ExceptionResponse(Date times, String message, String details) {
		super();
		this.times = times;
		this.message = message;
		this.details = details;
	}


	public Date getTimes() {
		return times;
	}


	public String getMessage() {
		return message;
	}


	public String getDetails() {
		return details;
	}
	

}
