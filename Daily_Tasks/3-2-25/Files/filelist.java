package Files;
import java.io.File;
	public class filelist {
		 public static void listFiles(String directoryPath) {
		        File directory = new File(directoryPath);

		        if (!directory.exists()) {
		            System.out.println("Error: Directory does not exist.");
		            return;
		        }

		        if (!directory.isDirectory()) {
		            System.out.println("Error: The given path is not a directory.");
		            return;
		        }

		        File[] files = directory.listFiles();

		        if (files == null || files.length == 0) {
		            System.out.println("The directory is empty.");
		            return;
		        }

		        System.out.println("Files and directories in: " + directoryPath);
		        for (File file : files) {
		            if (file.isFile()) {
		                System.out.println("[File] " + file.getName());
		            } else if (file.isDirectory()) {
		                System.out.println("[Directory] " + file.getName());
		            }
		        }
		    }
		public static void main(String[] args) {
			String directoryPath = "C:/Users/nandi"; 
	        listFiles(directoryPath);

		}

	}