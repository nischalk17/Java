import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {

        // Step 1: Create ServerSocket
        ServerSocket server = new ServerSocket(6000);
        System.out.println("Server started. Waiting for client...");

        // Step 2: Accept connection
        Socket client = server.accept();
        System.out.println("Client connected.");

        // Step 3: Create Input Stream to Receive data
        DataInputStream ins = new DataInputStream(client.getInputStream());
        int num1 = ins.readInt();
        int num2 = ins.readInt();
        System.out.println("Received from client: " + num1 + " " + num2);

        int largest = (num1 > num2) ? num1 : num2;

        // Step 5: Create OutputStream to send Send result back to client
        DataOutputStream outs = new DataOutputStream(client.getOutputStream());
        outs.writeInt(largest);

        // Close connections
        outs.close();
        ins.close();
        client.close();
        server.close();
    }
}
