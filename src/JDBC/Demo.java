package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws SQLException  {
	
		try {
			
			Class.forName(null);
			
			Connection con = DriverManager.getConnection(null, null, null);
			Statement smtn = con.createStatement();
			
			ResultSet Rs = smtn.executeQuery(null);
			
			while (Rs.next()) {
				System.out.println(Rs.getInt(0));
			}
			
		}catch (Exception e) {
			
		}
	}
}