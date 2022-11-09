import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int cubeSum = 0;
        int n = num;

        while (num != 0) {
            int rem = num % 10;
            cubeSum = cubeSum + (rem * rem * rem);
            num = num / 10;
        }

        if (cubeSum == n) {
            System.out.println("This is an armstrong number");
        } else
            System.out.println("This is not an armstrong number");

        in.close();

    }
}
