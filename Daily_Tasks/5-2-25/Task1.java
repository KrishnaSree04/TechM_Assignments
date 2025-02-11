package mysql;
import java.sql.*;
import java.util.Scanner;
public class Task1 {
		public static void main(String args[]) throws Exception,SQLException {
			Scanner scan = new Scanner(System.in);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Parkview@2020");
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?)");
			System.out.print("Enter the number of employees to insert: ");
		    int numRows = scan.nextInt();
		    scan.nextLine();
		    for (int i = 0; i < numRows; i++) {
			System.out.println("Enter the Employee "+(i+1)+" Id:");
			int emp_id;
			emp_id=scan.nextInt();
			
			System.out.println("Enter the Employee Name");
			String emp_name;
			emp_name=scan.next();
			pstmt.setInt(1, emp_id);
			pstmt.setString(2, emp_name);
			pstmt.addBatch();
		    }
			int[] value = pstmt.executeBatch();
			System.out.println(value.length + " Rows inserted into the table");
			
			pstmt.close();
			con.close();
		  }
		}

