import java.util.Scanner;

public class reverseNum {

    public static int reversing_via_while_loop(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static int reversing_via_for_loop(int num) {
        int rev = 0;
        for (int i = 0; i <= num; i++) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    static int ans = 0;

    public static int reversing_via_recursion(int num) {

        if (num == 0) {
            return ans;
        }

        if (num > 0) {
            int temp = num % 10;
            ans = ans * 10 + temp;
            reversing_via_recursion(num / 10);
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int reversedNum = reversing_via_while_loop(num);
        System.out.print("The reversed num via while loop : " + reversedNum);

        reversedNum = reversing_via_for_loop(num);
        System.out.print("\nThe reversed num via for loop : " + reversedNum);

        reversedNum = reversing_via_recursion(num);
        System.out.print("\nThe reversed num via recursion : " + reversedNum);

        in.close();

    }
}
