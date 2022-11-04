import java.util.Scanner;

public class simple_calculator {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter two numbers: ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();

    in.nextLine(); // input buffer

    // calculator via else if ladder:

    System.out.print("Let's do some operations..\nEnter ( +  , - , * , / ) : ");
    String operation = in.nextLine();

    if (operation.equals("+")) {
      System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
    } else if (operation.equals("-")) {
      System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
    } else if (operation.equals("*")) {
      System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
    } else if (operation.equals("/")) {
      if (num2 == 0) {
        System.out.println("A number can't be divided by 0");
      } else {
        System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
      }
    } else {
      System.out.println("Wrong Input");
    }

    // calculator via switch case statements:

    System.out.print(
        "\n\nLet's do a different operation..\nChoose any of the following:\n1 for +  \n2 for -\n3 for *\n4 for /\nEnter your decession: ");
    operation = in.nextLine();

    switch (operation) {
      case "1":
        System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
        break;
      case "2":
        System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
        break;
      case "3":
        System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
        break;
      case "4":
        if (num2 == 0) {
          System.out.println("A number can't be divided by 0");
        } else {
          System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
        }
        break;
      default:
        System.out.println("Wrong Input");

        /*
         * We should use switch case statements as these are faster than if else ladder.
         */

    }

    in.close();
  }
}
