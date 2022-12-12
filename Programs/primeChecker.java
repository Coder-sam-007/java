import java.util.Scanner;

public class primeChecker {

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (isPrime(num))
            System.out.println("this is a prime number");
        else
            System.out.println("this is not a prime number");

        in.close();

    }
}
