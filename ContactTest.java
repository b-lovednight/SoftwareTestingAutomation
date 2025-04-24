package test;
import static org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.asssertTrue;
import static org.junit.jupiter.api.Assertions.*;

import main.java.model.Contact; 

public class ContactTest {
	@Test
	void testContact() {
		Contact contact = new Contact("abcd123", "Joe", "Brown", "2134445555", "123 Shore Street"); 
		assertTrue(contact.getContactId().equals("abcd123"));
		assertTrue(contact.getFirstName().equals("Joe"));
		assertTrue(contact.getLastName().equals("Brown"));
		assertTrue(contact.getPhoneNum().equals("2134445555"));
		assertTrue(contact.getHomeAddr().equals("123 Shore Street"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("12345678910", "Joe", "Brown", "2134445555", "123 Shore Street");});
	}
}
