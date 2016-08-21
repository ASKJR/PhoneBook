package phonebook;

import java.util.ArrayList;

public class PhoneBook {
	ArrayList<Contact> contactList;
	
	//Constructor
	public PhoneBook(){
		contactList = new ArrayList<Contact>();
	}
	public void addContact(Contact contact){
		this.contactList.add(contact);
	}
	
}
