import java.util.Scanner;

public class conditionals {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // normal if else statement

    System.out.print("Enter you age: ");
    int age = input.nextInt();

    if (age > 18) {
      System.out.println("You can drive..");
    } else {
      System.out.println("You can't drive..");
    }

    System.out.print("Enter a number between 0 to 10: ");
    int num = input.nextInt();

    if (num > 0 && num < 10) {
      System.out.println("goood boi..");
    } else {
      System.out.println("mada fukker");
    }

    // switch case statements

    int Day = 0;

    switch (Day) {
      case 0:
        System.out.println("Sunday");
        break;

      case 6:
        System.out.println("Saturday");
        break;

      default:
        System.out.println("Other days");

    }

    // to run a code infinitely we can use true inside while

    int j = 1;

    while (true) {

      if (j == 10) {
        j++;
        continue;
      }
      if (j == 15) {
        break;
      }

      System.out.println(j);
      j++;

    }

    input.close();
  }
}
