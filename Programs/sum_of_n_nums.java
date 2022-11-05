import java.util.Scanner;

public class sum_of_n_nums {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a value up to how much you want to add: ");
    int n = in.nextInt();

    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += i;
    }

    System.out.println("The summation upto ur desired limit is: " + sum);

    in.close();

  }
}
