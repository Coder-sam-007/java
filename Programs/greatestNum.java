import java.util.Scanner;

public class greatestNum {

  public static int greatest_num(int num1, int num2, int num3) {
    int greatest;
    if (num1 > num2 && num1 > num3) {
      greatest = num1;
    } else if (num2 > num1 && num2 > num3) {
      greatest = num2;
    } else
      greatest = num3;
    return greatest;
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter three numbers: ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();

    System.out
        .println("The greatest num among the numbers that you have entered is: " + greatest_num(num1, num2, num3));
  }
}
