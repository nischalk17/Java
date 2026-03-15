import java.net.*;
import java.io.*;

public class URLConnectionExample {
    public static void main(String[] args) throws Exception {

        // Example URL: Plain text data from a public API
        URL url = new URL("https://www.google.com/robots.txt");
        URLConnection connection = url.openConnection();

        // Open the connection
        connection.connect();

        // Read data from the URL
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//         connection.getInputStream() returns an InputStream that reads raw bytes from the URL
//        new InputStreamReader(...) Converts bytes into characters (text) using a character encoding (default is UTF-8).
//        new BufferedReader(...) Wraps the InputStreamReader to make it efficient for reading text by allowing you to read line by line using .readLine().

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
