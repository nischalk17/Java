import java.io.*;
import java.net.*;


public class Server {
    public static void main(String[] args) throws Exception {

//          Create object of SeverSocket class with port no,
        ServerSocket server = new ServerSocket(6000);
        System.out.println("Server started. Waiting for Client...");

//            Call accept() to wait for a client conn
        Socket client = server.accept();
        System.out.println("Client Connected");

        DataInputStream ins = new DataInputStream(client.getInputStream());
        String str = ins.readUTF();
        System.out.println("Client says: " +str);

        DataOutputStream outs = new DataOutputStream(client.getOutputStream());
        outs.writeUTF("Hello Client");

        ins.close();
        outs.close();

        server.close();
        client.close();
    }
}