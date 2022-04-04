package Java;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
Class.forName("com.mysql.cj.jdbc.Driver");
//Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/CTS_DB","userName","password");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pavee", "root", "password");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from biodata");

while(rs.next())
System.out.println(rs.getInt(1)+"\t | "+rs.getString(2)+"\t | "+rs.getInt(3));

con.close();
}
}