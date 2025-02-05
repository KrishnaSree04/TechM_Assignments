package Files;
import java.io.File;
public class File_1 {

	public static void main(String[] args) {
		        String directoryPath = "C:\\Users\\krish\\OneDrive\\Desktop";

		        // Create a File object for the given directory
		        File directory = new File(directoryPath);

		        // Check if the directory exists and is a directory
		        if (directory.exists() && directory.isDirectory()) {
		            // Get all files and directories in the specified directory
		            String[] files = directory.list();

		            // Check if the directory is empty
		            if (files != null && files.length > 0) {
		                System.out.println("Files and directories in " + directoryPath + ":");
		                for (String file : files) {
		                    System.out.println(file);
		                }
		            } else {
		                System.out.println("The directory is empty.");
		            }
		        } else {
		            System.out.println("The specified path is not a valid directory.");
		        }


	}

}
