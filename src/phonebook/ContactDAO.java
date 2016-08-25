package phonebook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactDAO {
	private final static String INSERT = "INSERT INTO contact (name,address,email,phone) VALUES (?,?,?,?)";
	private final static String DELETE = "DELETE FROM contact WHERE id=?";
	private Connection con = null;
	private PreparedStatement stmt = null;
	
	public ContactDAO() {
	}
	 
	public void insert(Contact contact) {
		 try{
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(INSERT);	
			stmt.setString(1,contact.getName());
			stmt.setString(2,contact.getAddress());
			stmt.setString(3,contact.getEmail());
			stmt.setString(4,contact.getPhone());
			stmt.execute();
			stmt.close();
		 }catch(SQLException e) {
			 throw new RuntimeException(e);
		 }finally{
			 try { if (stmt != null) stmt.close(); } catch (Exception e) {};
			 try { if (con  != null) con.close();  } catch (Exception e) {};
		 }
	}
	 
	public void delete(Contact contact) {
		try {
			con = new ConnectionFactory().getConnection();
		    stmt = con.prepareStatement(DELETE);
		    stmt.setLong(1, contact.getId());
		    stmt.execute();
		    stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			try { if (stmt != null) stmt.close(); } catch (Exception e) {};
			try { if (con  != null) con.close();  } catch (Exception e) {};
		}
		
	}
		 
		 
}
	 
	  
	  

