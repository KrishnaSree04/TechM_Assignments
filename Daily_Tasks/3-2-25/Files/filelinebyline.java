package Files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class filelinebyline {
		public static void readFile(String filePath) {
	         try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);  
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading the file: " + e.getMessage());
	        }
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String filePath = "testing.txt";
	        readFile(filePath);
		}

	}
