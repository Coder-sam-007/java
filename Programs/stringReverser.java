import java.util.Scanner;

public class stringReverser {

    public static String reverseIt(String str) {

        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = in.nextLine();

        System.out.println("Reverse of your entered string is: " + reverseIt(str));

        in.close();

    }
}
