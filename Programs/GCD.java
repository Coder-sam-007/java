import java.util.Scanner;

public class GCD {

    public static int findHCF(int n1, int n2) {
        int hcf = 0;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            if (n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }

        return hcf;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.println("HCF of these numbers are: " + findHCF(n1, n2));

        in.close();

    }
}
