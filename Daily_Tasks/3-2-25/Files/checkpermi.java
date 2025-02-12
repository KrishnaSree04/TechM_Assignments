package Files;
import java.io.File;
public class checkpermi {
		public static void checkPermissions(String path) {
	        File file = new File(path);

	        if (!file.exists()) {
	            System.out.println("The specified file or directory does not exist.");
	            return;
	        }

	        boolean canRead = file.canRead();
	        boolean canWrite = file.canWrite();

	        System.out.println("Checking permissions for: " + path);
	        if (canRead) {
	            System.out.println("The file/directory has read permission.");
	        } else {
	            System.out.println("The file/directory does NOT have read permission.");
	        }

	        if (canWrite) {
	            System.out.println("The file/directory has write permission.");
	        } else {
	            System.out.println("The file/directory does NOT have write permission.");
	        }
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    String path="C:/Users/nandi/eclipse-workspace/first/src/main/java/exception/ex.txt";
	    checkPermissions(path);
		}

	}