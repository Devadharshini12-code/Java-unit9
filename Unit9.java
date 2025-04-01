
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Unit9 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        
        // Step 1: Create a File
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Step 2: Write to the File
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a sample text file.\nWelcome to Java file handling!");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // Step 3: Read from the File
            Scanner reader = new Scanner(file);
            System.out.println("File content:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

            // Step 4: Delete the File
            if (file.delete()) {
                System.out.println("Deleted the file: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
    
    

