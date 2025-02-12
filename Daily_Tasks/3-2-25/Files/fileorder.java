package Files;
import java.io.File;
public class fileorder {
		public static void checkfileordir(String path) {
	        File file = new File(path);

	        if (file.exists()) {
	            if (file.isFile()) {
	                System.out.println("it is a file.");
	            } else if (file.isDirectory()) {
	                System.out.println("it is a directory.");
	            }
	        } else {
	            System.out.println("The specified path does not exist.");
	        }
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String path="C:/Users/nandi/eclipse-workspace/first/src/main/java/exception/ex.txt";
			   checkfileordir(path);
		}

	}


		
	
