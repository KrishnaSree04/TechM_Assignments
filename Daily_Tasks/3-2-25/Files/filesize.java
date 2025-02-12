package Files;
import java.io.File;
public class filesize {
		public static void getFileSize(String filePath) {
	        File file = new File(filePath);

	        if (!file.exists()) {
	            System.out.println("The specified file does not exist.");
	            return;
	        }

	        long sizeInBytes = file.length();

	        double sizeInKB = sizeInBytes / 1024.0;
	        double sizeInMB = sizeInKB / 1024.0;

	        
	        System.out.println("File size in bytes: " + sizeInBytes + " bytes");
	        System.out.println("File size in KB: " + sizeInKB + " KB");
	        System.out.println("File size in MB: " + sizeInMB + " MB");
	    }

		public static void main(String[] args) {
			String filePath = "C:/Users/nandi/eclipse-workspace/first/src/main/java/exception/ex.txt";
	      getFileSize(filePath);
		}

	}

