package mysql;
import java.sql.*;
import java.util.Scanner;
public class Task4 {
		public static void main(String args[]) throws Exception,SQLException {
			Scanner scan = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","Parkview@2020");
			boolean exit = false;
			PreparedStatement pstmt = null;
		    while (!exit) {
		        System.out.println("\nMenu:");
		        System.out.println("1. Insert a new Row");
		        System.out.println("2. Update a Row");
		        System.out.println("3. Delete a Row");
		        System.out.println("4. Select a Row");
		        System.out.println("5. Exit");
		        System.out.print("Enter your choice: ");
		        int choice = scan.nextInt();
		        //scan.nextLine();  

		        switch (choice) {
		            case 1:  
		                System.out.println("Enter Employee Details to Insert");
		                System.out.print("Enter Employee ID: ");
		                int emp_id = scan.nextInt();
		                scan.nextLine(); // Consume newline
		                System.out.print("Enter Employee Name: ");
		                String emp_name = scan.nextLine();

		                pstmt = con.prepareStatement("INSERT INTO employee (emp_id, emp_name) VALUES (?, ?)");
		                pstmt.setInt(1, emp_id);
		                pstmt.setString(2, emp_name);

		                int rowsInserted = pstmt.executeUpdate();
		                if (rowsInserted > 0) {
		                    System.out.println("Employee added successfully!");
		                } else {
		                    System.out.println("Failed to add employee.");
		                }
		                break;

		            case 2: 
		                System.out.print("Enter Employee ID to Update: ");
		                emp_id = scan.nextInt();
		                
		                System.out.print("Enter new Employee Name: ");
		                emp_name = scan.nextLine();
		               
		                pstmt = con.prepareStatement("UPDATE employee SET emp_name = ? WHERE emp_id = ?");
		                pstmt.setString(1, emp_name);
		                pstmt.setInt(2, emp_id);

		                int rowsUpdated = pstmt.executeUpdate();
		                if (rowsUpdated > 0) {
		                    System.out.println("Employee details updated successfully!");
		                } else {
		                    System.out.println("No employee found with ID " + emp_id);
		                }
		                break;

		            case 3:  
		                System.out.print("Enter Employee ID to Delete: ");
		                emp_id = scan.nextInt();

		                pstmt = con.prepareStatement("DELETE FROM employee WHERE emp_id = ?");
		                pstmt.setInt(1, emp_id);

		                int rowsDeleted = pstmt.executeUpdate();
		                if (rowsDeleted > 0) {
		                    System.out.println("Employee with ID " + emp_id + " deleted successfully!");
		                } else {
		                    System.out.println("No employee found with ID " + emp_id);
		                }
		                break;

		            case 4: 
		                System.out.print("Enter Employee ID to Select: ");
		                emp_id = scan.nextInt();

		                pstmt = con.prepareStatement("SELECT * FROM employee WHERE emp_id = ?");
		                pstmt.setInt(1, emp_id);

		                ResultSet rs = pstmt.executeQuery();
		                if (rs.next()) {
		                    System.out.println("Employee Details:");
		                    System.out.println("ID: " + rs.getInt("emp_id"));
		                    System.out.println("Name: " + rs.getString("emp_name"));
		                      } else {
		                    System.out.println("No employee found with ID " + emp_id);
		                }
		                break;

		            case 5:  // Exit
		                System.out.println("Exiting...");
		                exit = true;
		                break;

		            default:
		                System.out.println("Invalid choice. Please try again.");
		        }
		    }
		    pstmt.close();
			con.close();
			
			
		}
		}

