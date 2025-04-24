package test;
// Importing libraries for testing 
import static org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.assertTrue; 
import static org.junit.jupiter.api.Assertions.*; 

// Importing Task Package to test it 
import main.java.model.Task; 

public class TaskTest {
	// Test for good input 
	@Test 
	void testTask() {
		Task task = new Task("abcd123", "Joe Brown", "New Example for Testing"); 
		assertTrue(task.getTaskId().equals("abcd123"));
		assertTrue(task.getFullName().equals("Joe Brown"));
		assertTrue(task.getReqDescription().equals("New Example for Testing"));
	}
	// Test for bad taskId input 
	@Test
	void testTaskIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new task("1234567890", "Joe Brown", "New Example for FAIL taskId Testing");});
	}
	// Test for bad fullName input 
	@Test
	void testFullNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new task("abcd123", "Joseph Name Way Too Long Brown", "New Example for FAIL fullName Testing");});
	}
	// Test for bad reqDescription input 
	@Test
	void testReqDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new task("abcd123", "Joe Brown", "I dont know what to write about so I will try to ramble as much as possible to reach the 50 character count and show that this description is way more than 50 which is quite a lot");});
	}
}
