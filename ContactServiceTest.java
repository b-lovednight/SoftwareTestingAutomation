package test;

import statis
import main.java.model.ContactService;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.BeforeEach;

public class ContactServiceTest {
	
	private ContactService contactService; 
	
	// Setup all tests in the class before initializing 
	@BeforeEach
	public void setup() {
		contactService = new ContactService();
	}
	
	@Test
	public void testAddContact() {
		contactService.addContact("abcd", "Joe", "Brown", "2134445555", "123 Shore Street");
	}
	
	@Test // Testing by adding the same Duplicate Contact 
	public void testAddDuplicateContact() {
		contactService.addContact("abcd", "Joe", "Brown", "2134445555", "123 Shore Street");
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {throw new IllegalArgumentException("Duplicate Input");});
		assertEquals("Duplicate Input", exception.getMessage());
	}
	
	@Test
	public void testDeleteContact() {
		contactService.deleteContact("abcd");
	}
	
	@Test
	public void testDeleteUnknownContact() {
		contactService.deleteContact("1");
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {throw new IllegalArgumentException("Unknown ID");});
		assertEquals("Unknown Input CANNOT DELETE", exception.getMessage());
	}
	
	@Test
	public void testUpdateContact() {
		contactService.updateContact("abcd", "Jane", "Brown", "1234567890", "321 Shore Street");
	}
	
	@Test 
	public void testUpdateUnknownContact() {
		contactService.updateContact("12", "Jane", "Brown", "6612131234", "NOT FOUND");
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {throw new IllegalArgumentException("Unknown ID");});
		assertEquals("Unknown Input CANNOT UPDATE", exception.getMessage());
	}
}
