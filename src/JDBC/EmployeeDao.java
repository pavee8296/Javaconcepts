package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {
	
	//get the conenction	
	
	
	//create== save
	
	
	//read == select
	
	
	//update == update
	
	
	//delete  == delete
	
	
	
	
	
	public static void main(String args[])
	{
		  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/pavee","root","password");
			System.out.println("Connected sucessfully");
		
			Statement stmt= con.createStatement();
			
			stmt.executeUpdate("insert into emp values(123,'sam',23)");
			System.out.println("inserted  sucessfully");
			
			
			ResultSet rs= stmt.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			
			//update
			
			
			stmt.executeUpdate("update emp set name='Ram' where id=123");
			
			stmt.executeUpdate("update emp set name='pavee' where id=123");
			
			//delete
			//stmt.executeUpdate("delete from emp where id=123");
			
						
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
		
	}

}
