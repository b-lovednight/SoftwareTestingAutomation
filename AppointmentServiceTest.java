package test;

// Importing libraries for testing 
import static org.junit.jupiter.api.Assertion.*;
import static org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Importing Appointment Package and utilities for testing
import main.java.model.AppointmentService; 
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppointmentServiceTest {
	// Initialize the AppointmentService Constructor to create new test objects for BeforeEach setup 
	private AppointmentService appointmentService; 
	
	// Setup all tests in the class before testing 
	@BeforeEach
	public void setup() {
		appointmentService = new AppointmentService();
		// Setup a valid Date class object 
		SimpleDateFormat sdf1 = new SimpleDateFormat("08-04-2025"); 
		Date validApptDate = sdf1.parse("08-04-2025"); 
		// Setup an invalid Date class object
		SimpleDateFormat sdf2 = new SimpleDateFormat("01-04-2023");
		Date invalidApptDate = sdf2.parse("01-04-2023");
	}
	// Test for addAppt method in Service
	@Test
	public void testAddAppointment() {
		// Test for valid input for adding Appointment
		SimpleDateFormat sdf1 = new SimpleDateFormat("08-04-2025"); 
		Date validApptDate = sdf1.parse("08-04-2025");
		appointmentService.addAppt("abcd789", validApptDate, "VALID INPUT");
	}
	// Test for deleteAppt method in Service 
	@Test
	public void testDeleteAppointment() {
		appointmentService.deleteAppt("abcd789");
	}
	// Test for exception to catch Unknown Appointment deletion
	@Test
	public void testDeleteUnknownAppointment() {
		appointmentService.deleteAppt("1");
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {throw new IllegalArgumentException("Unknown ID");});
		assertEquals("Unknown Appointment ID Cannot Delete", exception.getMessage());
	}
}
