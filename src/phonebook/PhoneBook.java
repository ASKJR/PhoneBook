package phonebook;

import java.util.ArrayList;

public class PhoneBook {
	private ArrayList<Contact> contactList;
	
	//Constructor.
	public PhoneBook(){
		contactList = new ArrayList<Contact>();
	}
	//Adding contact in contactList.
	public void addContact(Contact contact){
		this.contactList.add(contact);
	}
	//Remove contact by name.
	public void removeContactByName(String name){
		for(Contact contact: contactList){
			if(contact.getName().equals(name)){
				contactList.remove(contact);
			}
		}
	}
	//Searching contact by name.
	public Contact getContactByName(String name){
		for(Contact contact : contactList){
			if(contact.getName().equals(name)){
				return contact;
			}
		}
		return null;
	}
	public ArrayList<Contact> getContactList() {
		return contactList;
	}
	public void setContactList(ArrayList<Contact> contactList) {
		this.contactList = contactList;
	}
	public String toString(){
		String toReturn = "";
		for(Contact contact : contactList){
			toReturn += contact.toString() + "\n";
		}
		return toReturn;
	}
}
