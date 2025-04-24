package main.java.model;

// Importing libraries to use HashMaps for storing information within Memory instead of a database 
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class AppointmentService {
	// Declare new Map to use HashMap and hold each Appointment object 
	private Map<String, Appointment> appointments; 
	
	// Constructor for the AppointmentService to build new HashMaps for each key value set 
	public AppointmentService() {
		appointments = new HashMap<>();
	}
	
	// Method for adding an Appointment 
	public void addAppt(String apptId, Date apptDate, String reqDescription) {
		if (appointments.containsKey(apptId)) {
			// Throw an exception IF the apptId already exists in Memory
			throw new IllegalArgumentException("Appointment ID already exists!"); 
		}
		appointments.put(apptId, new Appointment(apptId, apptDate, reqDescription));
	}
	
	public void deleteAppt(String apptId) {
		if (!appointments.containsKey(apptId)) {
			// Throw an exception IF the apptId does not exist in Memory
			throw new IllegalArgumentException("Appointment ID not found!");
		}
		appointments.remove(apptId);
	}
}
