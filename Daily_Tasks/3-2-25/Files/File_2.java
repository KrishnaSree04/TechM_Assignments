package Files;
import java.io.File;
public class File_2 {

	public static void main(String[] args) {
		        // Specify the directory and file extension
		        String directoryPath = "C:\\Users\\krish\\OneDrive\\Desktop";
		        String extension = ".pdf"; // Specify the extension to filter by

		        File directory = new File(directoryPath);

		        // Check if the directory exists
		        if (directory.exists() && directory.isDirectory()) {
		            // List all files with the specified extension
		            File[] files = directory.listFiles((dir, name) -> name.endsWith(extension));

		            // Print the matching files
		            if (files != null && files.length > 0) {
		                for (File file : files) {
		                    System.out.println(file.getName());
		                }
		            } else {
		                System.out.println("No files with " + extension + " extension found.");
		            }
		        } else {
		            System.out.println("Invalid directory.");
		        }

	}

}
