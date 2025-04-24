package test;

// Importing libraries for testing 
import static org.junit.jupiter.api.Assertion.*; 
import static org.junit.jupiter.api.BeforeEach; 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Importing TaskService package to test it 
import main.java.model.TaskService;

public class TaskServiceTest {
	// Initialize the TaskService Constructor to create new test objects for BeforeEach setup 
	private TaskService taskService; 
	
	// Setup all tests in the class before testing 
	@BeforeEach
	public void setup() {
		taskService = new TaskService(); 
		// does not require any arguments because the Constructor does not have any to create the HashMap
	}
	
	@Test
	public void testAddTask() {
		// Test for valid input for adding Task 
		taskService.addTask("abcd123", "Joe Brown", "TRUE GOOD INPUT");
	}
	
	@Test
	public void testAddDuplicateTask() {
		// Test for exception to catch Duplicate adding Task 
		taskService.addTask("abcd123", "Joe Brown", "TRUE GOOD INPUT");
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {throw new IllegalArgumentException("Duplicate Input");});
		assertEquals("Duplicate Input", exception.getMessage());
	}
	
	@Test
	public void testDeleteTask() {
		// Test for valid deletion of Task 
		taskService.deleteTask("abcd1234");
	}
	
	@Test 
	public void testDeleteUnknownTask() {
		// Test for exception to catch Unknown Task Deletion 
		taskService.deleteTask("1");
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {throw new IllegalArgumentException("Unknown ID");});
		assertEquals("Unknown Input CANNOT DELETE", exception.getMessage());
	}
	
	@Test 
	public void testUpdateTask() {
		// Test for valid update of Task 
		taskService.updateTask("abcd1234", "Jane Brown", "TRUE GOOD UPDATE");
	}
	
	@Test
	public void testUpdateUnknownTask() {
		// Test for exception to catch Unknown Task Update 
		taskService.updateTask("14", "Gerry Grey", "NOT FOUND");
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {throw new IllegalArgumentException("Unknown ID");});
		assertEquals("Unknown Input CANNOT UPDATE", exception.getMessage());
	}
}
