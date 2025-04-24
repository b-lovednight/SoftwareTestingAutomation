package test;

// Importing libraries for testing 
import static org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.assertTrue;

//Importing Appointment Package and utilities to test 
import main.java.model.Appointment; 
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppointmentTest {
	// Test for valid input 
	@Test
	void testAppointment() {
		// Creates a new Date object to be used in the assertion 
		SimpleDateFormat sdf = new SimpleDateFormat("08-04-2025");
		Date validApptDate = sdf.parse("08-04-2025");
		Appointment appointment = new Appointment("abcd789", validApptDate, "New Example for Valid Testing");
		assertTrue(appointment.getApptId().equals("abcd789"));
		assertTrue(appointment.getApptDate().equals("08-04-2025"));
		assertTrue(appointment.getReqDescription().equals("New Example for Valid Testing"));
	}
	// Test for invalid ID and Date input 
	@Test
	void testAppointmentIdTooLong() {
		SimpleDateFormat sdf = new SimpleDateFormat("01-04-2023");
		Date invalidApptDate = sdf.parse("01-04-2023");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new appointment("12345678901", invalidApptDate, "New Example for Invalid Testing");});
	}
	// Test for invalid Description Input 
	void testReqDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new appointment("abcd123", validApptDate, "This ramble is to test for an invalid requirements description that is wayy too long and should not even be written like this because it makes the IDE go crazy.");});
	}
}
