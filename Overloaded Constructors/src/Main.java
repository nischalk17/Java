public class Main {
    public static void main(String[] args) {

    // Overloaded Constructors allows a class to have multiple constructors
    // with different parameter lists.
    // Enable objects to be initialized in various ways

        User user0 = new User();
        User user1 = new User("Nischal");
        User user2 = new User("Dhoj", "nischal10@gmail.com");
        User user3 = new User("Kunwar", "nischal15@gmail.com", 22);

        System.out.println(user0.username);
        System.out.println(user0.email);
        System.out.println(user0.age);

        System.out.println();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println();

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println();

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}
