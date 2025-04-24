package main.java.model;
// Importing libraries for Hash Map usage Key-Value Pairs 
// Key is contactID, Value is Contact Class Object including all its variables 
import java.util.HashMap; 
import java.util.Map; 

public class ContactService {
	private Map<String, Contact> contacts; 
	// Constructor for the ContactService Object 
	public ContactService() {
		contacts = new HashMap<>();
	}
	
	// Methods for Adding, Deleting and Updating Contacts via Contact ID 
	public void addContact(String contactId, String firstName, String lastName, String phoneNum, String homeAddr) {
		if (contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID already exists"); 
		}
		// puts method adds the newly constructed Contact Class Object into the HashMap 
		contacts.put(contactId, new Contact(contactId, firstName, lastName, phoneNum, homeAddr));
	}
	
	public void deleteContact(String contactId) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID not found!"); 
		}
		contacts.remove(contactId); 
	}
	
	public void updateContact(String contactId, String firstName, String lastName, String phoneNum, String homeAddr) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID not found!"); 
		}
		// Get the Contact Class Object from the Hash Map key-value pair 
		Contact contact = contacts.get(contactId); 
		// Update the Contact Class Components below 
		contact.setFirstName(firstName); 
		contact.setLastName(lastName); 
		contact.setPhoneNum(phoneNum);
		contact.setHomeAddr(homeAddr);
		// Update the information within the Hash Map key-value pair 
		contacts.put(contactId, contact);
	}
}
