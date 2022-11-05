import java.util.Scanner;

public class multiply_float {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two floating numbers: ");

        float num1 = in.nextFloat();
        float num2 = in.nextFloat();

        System.out.println("The product of your Entered numbers are: " + (num1 * num2));

        in.close();
    }

}
