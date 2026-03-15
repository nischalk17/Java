public class SQLconnection {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //lekhnai parcha
            System.out.println("Yes");
        }
        catch (ClassNotFoundException e){
            System.out.println("Connection failed");
        }
    }
}
