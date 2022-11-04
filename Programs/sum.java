import java.util.Scanner;

public class sum {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int sum = 0, num = 0;
    do {
      System.out.print("Enter a number: ");
      num = in.nextInt();
      sum += num;
      System.out.println("Your sum is: " + sum);

    } while (num != 0);

    in.close();

    System.out.println("The End");

  }
}
