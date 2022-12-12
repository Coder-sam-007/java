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

    System.out.print("Enter a number: ");
    int num = in.nextInt();

    System.out.print("The factorial of your given number is: " + facto(num));
    in.close();

  }
}
