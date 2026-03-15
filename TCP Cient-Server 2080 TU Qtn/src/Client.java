import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {

        // Step 1: Create socket and connect to server
        Socket client = new Socket("localhost", 6000);

        // Step 2: Create OutputStream and send two integers
        DataOutputStream outs = new DataOutputStream(client.getOutputStream());
        int num1 = 30;
        int num2 = 50;
        outs.writeInt(num1);
        outs.writeInt(num2);

        // Step 3: Create InputStream and Receive response
        DataInputStream ins = new DataInputStream(client.getInputStream());
        int largest = ins.readInt();
        System.out.println("Largest integer is: " + largest);

        // Close connections
        outs.close();
        ins.close();
        client.close();
    }
}
