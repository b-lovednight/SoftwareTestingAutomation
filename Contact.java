package main.java.model;

public class Contact {
	// Declaring all variables required for the Contact Class Object 
	private final String contactId; // Final makes the variable immutable 
	private String firstName; 
	private String lastName; 
	private String phoneNum; 
	private String homeAddr; 
	
	// Constructor for the Contact Class Object 
	public Contact(String contactId, String firstName, String lastName, String phoneNum, String homeAddr) {
		if (contactId == null || contactId.length() > 10) {
			// Milestone Requirement for variable 
			throw new IllegalArgumentException("Invalid input for Contact ID");
		}
		if (firstName == null || firstName.length() > 10) {
			// Milestone Requirement for variable 
			throw new IllegalArgumentException("Invalid input for First Name");
		}
		if (lastName == null || lastName.length() > 10) {
			// Milestone Requirement for variable 
			throw new IllegalArgumentException("Invalid input for Last Name");
		}
		if (phoneNum == null || phoneNum.length() != 10) {
			// Milestone Requirement for variable
			throw new IllegalArgumentException("Invalid input for Phone Number");
		}
		if (homeAddr == null || homeAddr.length() > 30) {
			// Milestone Requirement for variable 
			throw new IllegalArgumentException("Invalid input for Address");
		}
		
		this.contactId = contactId;
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.phoneNum = phoneNum; 
		this.homeAddr = homeAddr; 
	}
	
	// Setters and Getters 
	// Contact ID does not have a setter because it is meant to be immutable
	public String getContactId() {
		return contactId; 
	}
	
	public String getFirstName() {
		return firstName; 
	}
	public void setFirstName(String firstName) {
		// Added exception cases to each setter in case of bad input after initial construction 
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid input for First Name");
		}
		this.firstName = firstName; 
	}
	
	public String getLastName() {
		return lastName; 
	}
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid input for Last Name");
		}
		this.lastName = lastName; 
	}
	
	public String getPhoneNum() {
		return phoneNum; 
	}
	public void setPhoneNum(String phoneNum) {
		if (phoneNum == null || phoneNum.length() != 10) {
			throw new IllegalArgumentException("Invalid input for Phone Number");
		}
		this.phoneNum = phoneNum; 
	}
	
	public String getHomeAddr() {
		return homeAddr; 
	}
	public void setHomeAddr(String homeAddr) {
		if (homeAddr == null || homeAddr.length() > 30) {
			throw new IllegalArgumentException("Invalid input for Address");
		}
		this.homeAddr = homeAddr; 
	}
}
