import java.net.URL;

public class URLParser {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://helloword.com:80/files/tutorial");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());

        } catch (Exception e) {
            System.out.println("Invalid URL");
        }
    }
}

//Output:
//Protocol: http
//Authority: helloword.com:80
//Host: helloword.com
//Port: 80
//Path: /files/tutorial
