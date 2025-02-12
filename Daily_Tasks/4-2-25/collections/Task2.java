package mysql;
import java.sql.*;
import java.util.Scanner;
public class Task2 {
		public static void main(String args[]) throws Exception,SQLException {
			Scanner scan = new Scanner(System.in);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Parkview@2020");
			
			System.out.println("Enter the Employee Id to be updated");
			int emp_id;
			emp_id=scan.nextInt();
			
			System.out.println("Enter the Employee Name:");
			String emp_name;
			emp_name=scan.next();
			
			PreparedStatement pstmt = con.prepareStatement("update employee set emp_name=? where emp_id=?");
			pstmt.setString(1, emp_name);
			pstmt.setInt(2, emp_id);
			int value = pstmt.executeUpdate();
			if(value>0)
			System.out.println("employee details updated successfully");
			else
				 System.out.println("No employee found with ID: " + emp_id);
			pstmt.close();
			con.close();
		  }
		}

