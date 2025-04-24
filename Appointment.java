package main.java.model;

import java.util.Date;

public class Appointment {
	// Declaring all variables required for the Appointment Class Object 
	private final String apptId; 
	private final Date currDate = new Date();
	private Date apptDate; 
	private String reqDescription; 
	
	public Appointment(String apptId, Date apptDate, String reqDescription) {
		if (apptId == null || apptId.length() > 10) {
			// Throw an exception 
			throw new IllegalArgumentException("Invalid Appointment ID");
		}
		if (apptDate.before(currDate)) {
			// Throw an exception
			throw new IllegalArgumentException("Invalid Appointment Date, cannot be in the past");
		}
		if (reqDescription == null || reqDescription.length() > 50) {
			// Throw an exception
			throw new IllegalArgumentException("Invalid Description, cannot be over 50 character or empty"); 
		}
		
		this.apptId = apptId;
		this.apptDate = apptDate;
		this.reqDescription = reqDescription; 
	}
	
	public String getApptId() {
		return apptId;
	}
	
	public Date getApptDate() {
		return apptDate; 
	}
	public void setApptDate(Date apptDate) {
		if (apptDate.before(currDate)) {
			// Throw an exception
			throw new IllegalArgumentException("Invalid Appointment Date, cannot be in the past"); 
		}
		this.apptDate = apptDate; 
	}
	
	public String getReqDescription() {
		return reqDescription;
	}
	public void setReqDescription(String reqDescription) {
		if (reqDescription == null || reqDescription.length() > 50) {
			// Throw an exception 
			throw new IllegalArgumentException("Invalid Description, cannot be over 50 characters or empty"); 
		}
	}
}
