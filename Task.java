package main.java.model;

public class Task {
	// declaring all objects required for the Task Class 
	private final String taskId; 
	private String fullName; 
	private String reqDescription; 
	
	// Constructor for Task Class Object 
	public Task(String taskId, String fullName, String reqDescription) {
		// Checks if taskId is either null or greater than 10 characters
		if (taskId == null || taskId.length() > 10) {
			// Throw an exception 
			throw new IllegalArgumentException("Invalid Task ID Input"); 
		}
		// Checks if fullName is either null or greater than 20 characters
		if (fullName == null || fullName.length() > 20) {
			// Throw an exception 
			throw new IllegalArgumentException("Invalid Full Name Input");
		}
		// Checks if reqDescription is either null or greater than 50 characters
		if (reqDescription == null || reqDescription.length() > 50) {
			// Throw an exception 
			throw new IllegalArgumentException("Invalid Description Input"); 
		}
		
		// Sets the varaiables for the first time 
		this.taskId = taskId; 
		this.fullName = fullName; 
		this.reqDescription = reqDescription; 
	}
	// Setters and Getters 
	public String getTaskId() {
		return taskId; 
	}
	
	public String getFullName() {
		return fullName; 
	}
	public void setFullName(String fullName) {
		if (fullName == null || fullName.length() > 20) {
			// Throw an exception 
			throw new IllegalArgumentException("Invalid Full Name Input"); 
		}
		this.fullName = fullName; 
	}
	
	public String getReqDescription() {
		return reqDescription; 
	}
	public void setReqDescription(String reqDescription) {
		if (reqDescription == null || reqDescription.length() > 50) {
			// Throw an exception 
			throw new IllegalArgumentException("Invalid Description Input"); 
		}
		this.reqDescription = reqDescription; 
	}
}
