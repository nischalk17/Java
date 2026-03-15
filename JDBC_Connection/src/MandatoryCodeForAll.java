public class MandatoryCodeForAll {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //lekhnai parcha; forName le chai package load garna help garcha
        }
        catch (ClassNotFoundException e){
            System.out.println("Connection failed");
        }
    }
}
