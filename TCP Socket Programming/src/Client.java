import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[] args) throws Exception{

        // create socket and conect to server by passing server_address and port_no as parameters

        Socket client = new Socket("localhost", 6000);

        DataOutputStream outs = new DataOutputStream(client.getOutputStream());
        outs.writeUTF("Hello Server");

        DataInputStream ins = new DataInputStream(client.getInputStream());
        String str = ins.readUTF();
        System.out.println("Server says: " +str);

        outs.close();
        ins.close();

        client.close();
    }
}