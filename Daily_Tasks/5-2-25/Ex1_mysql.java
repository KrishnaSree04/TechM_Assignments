package mysql;
import java.sql.*;
import java.util.Scanner;
public class Ex1_mysql {

	public static void main(String[] args) throws Exception,SQLException {
		// TODO Auto-generated method stub
		//register the driver to connect to mysql environment
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Parkview@2020");
		//enable the STatement object to pass sql queries.
		Statement stmt = con.createStatement();
		//use the ResultSet
		ResultSet rs = stmt.executeQuery("select * from employee");
		
		//iterate the rows
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			//System.out.println(rs.getInt(3));
		}
		
		rs.close();
		stmt.close();
		con.close();

	}

}
