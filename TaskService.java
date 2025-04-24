package main.java.model;

// Importing libraries to use HashMaps for storing information within Memory instead of a database 
import java.util.HashMap;
import java.util.Map; 

public class TaskService {
	// Declare new Map to use HashMaps and hold each Task object 
	private Map<String, Task> tasks; 
	// Constructor for the TaskService build new HashMap to hold key value pairs 
	public TaskService() {
		tasks = new HashMap<>();
	}
	// Method for adding a Task 
	public void addTask(String taskId, String fullName, String reqDescription) {
		if (tasks.containsKey(taskId)) {
			// Throw an exception IF the taskId already exists 
			throw new IllegalArgumentException("Task ID already exists"); 
		}
		tasks.put(taskId,  new Task(taskId, fullName, reqDescription));
	}
	
	public void deleteTask(String taskId) {
		if(!tasks.containsKey(taskId)) {
			// Throw an exception IF the taskId does not exist
			throw new IllegalArgumentException("Task ID does not exist");
		}
		tasks.remove(taskId);
	}
	
	public void updateTask(String taskId, String fullName, String reqDescription) {
		if(!tasks.containsKey(taskId)) {
			// Throw an exception IF the taskId does not exist
		}
		// Creates a task object that will get all the key value pairs for the unique taskId
		Task task = tasks.get(taskId);
		// Uses the Setter Method to set new fullName
		task.setFullName(fullName);
		// Uses the Setter Method to set a new reqDescription
		task.setReqDescription(reqDescription);
		// Uses the tasks HashMap method to put the updated key value pair object into the HashMap 
		tasks.put(taskId,  task);
	}
}
