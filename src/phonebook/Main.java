package phonebook;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
		PhoneBook pb = new PhoneBook();
		ArrayList<Contact> contactList = new  ArrayList<Contact>();
		Contact c1 = new Contact("Jose","Av bandeirantes, 1299","jose@gmail.com","9999-9999");
		Contact c2 = new Contact("Ruan","Av dos imigrantes, 566","ruan@gmail.com","9999-9999");
		Contact c3 = new Contact("Maria","Av Brasil,678","maria@gmail.com","9999-9999");
		contactList.add(c1);
		contactList.add(c2);
		contactList.add(c3);
		pb.setContactList(contactList);
		System.out.println(pb);
		pb.removeContactByName("Ruan");
		System.out.println(pb);
		
		ContactDAO dao = new ContactDAO();
		c2.setId(2);
		dao.insert(c1);
		dao.insert(c2);
		dao.insert(c3);
		dao.delete(c2);
		
	}

}
