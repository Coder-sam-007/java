import java.util.Scanner;

public class multiplication_table {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a number up to which you want multiplication table of: ");
    int num = in.nextInt();

    for (int i = 1; i <= num; i++) {
      System.out.println("Multiplication table of " + i + " is:");
      for (int j = 1; j <= 10; j++) {
        System.out.printf("%d X %d = %d\n", j, i, j * i);
      }
      System.out.println("");
    }

    in.close();
  }
}
