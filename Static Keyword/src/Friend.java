public class Friend {

    static int numOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends.");
//        normally to access the attribute, we would use this.name
//        but while working with static attribute, we don't need "this"
//        as "this" refers to the object we're currently working with
//        simply just use the static attribute as this attribute belongs to the Class
    }

}
