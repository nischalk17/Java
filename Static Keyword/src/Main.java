public class Main {
    public static void main(String[] args) {

//        Static makes a variable or method belong to the class rather than to any specific object.
//        Commonly used for utility methods (like round method in Math Class)
//        or shared resources (among objects created from that class).

        Friend friend1 = new Friend("Nischal");
        Friend friend2 = new Friend("Dhoj");
        Friend friend3 = new Friend("Kunwar");

//        System.out.println(friend1.numOfFriends);
//        System.out.println(friend2.numOfFriends);
//        System.out.println(friend3.numOfFriends);

//        When accessing a static variable or a static method, it is better to use
//        the Class Name itself rather than any objects created from the class
//        All the friend objects share the same attribute rather than each of them having their own copy
//        i.e. instead of doing the above, do this instead:

        System.out.println(Friend.numOfFriends);

        // to call Static method, just use Class Name
        Friend.showFriends();

    }
}
