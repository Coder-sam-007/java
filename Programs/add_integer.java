import java.util.Scanner;

public class add_integer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two integers: ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("The sum of your Entered numbers are: " + (num1 + num2));

    }
}
