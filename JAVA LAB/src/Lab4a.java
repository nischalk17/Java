import java.io.File;
public class Lab4a {
    public static void main(String[] args) {
        String path = "C:/Users/Nischal/Desktop/Nischal.txt";
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File exists: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
