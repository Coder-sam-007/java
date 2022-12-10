import java.util.Scanner;

public class factorial {

    public static int facto(int num) {
        if (num >= 1) {
            return num * facto(num - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = in.nextInt();

        System.out.println("The factorial of " + num + " is " + facto(num));

        in.close();

    }

}