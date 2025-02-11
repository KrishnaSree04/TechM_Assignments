package mysql;
import java.sql.*;
import java.util.Scanner;
public class Task3 {
		public static void main(String args[]) throws Exception,SQLException {
			Scanner scan = new Scanner(System.in);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Parkview@2020");
			
			System.out.println("Enter the Employee Id to be deleted");
			int emp_id;
			emp_id=scan.nextInt();
			
			
			PreparedStatement pstmt = con.prepareStatement("delete from employee where emp_id=?");
			pstmt.setInt(1, emp_id);
			int value = pstmt.executeUpdate();
			if(value>0)
			System.out.println("employee with id:"+emp_id+" details deleted successfully");
			else
				 System.out.println("No employee found with ID: " + emp_id);
			pstmt.close();
			con.close();
		  }
		}

