import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Lab4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        String fileName = "Nischal.txt";
        File file = new File(desktopPath, fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
            System.out.print("Enter text to write in the file: ");
            String input = sc.nextLine();
            FileWriter writer = new FileWriter(file);
            writer.write(input + "\n");
            writer.close();
            System.out.println("Text written to file successfully.");
            System.out.println("\nReading file content line by line:");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        sc.close();
    }
}
