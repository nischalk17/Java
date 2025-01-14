public class Main {

    public static void main(String[] args) {

        char[][] telephone = {  {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'},
        };

        System.out.println("-------------");
        for (char[] row : telephone) {
            System.out.print("| ");
            for (char character : row) {
                System.out.print(character + " | ");
            }
            System.out.println("\n-------------");
        }
    }
}
