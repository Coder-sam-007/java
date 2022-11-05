import java.util.Scanner;

public class Guess_a_num {

  public static int GenerateRandomNum() {
    int num = (int) Math.floor(Math.random() * 100);
    return num;
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println(
        "\nWe have created a Random number\nYou have to guess the number\nIf you guessed the number correctly, you win.\n\nSo let's begin...");

    int randomNum = GenerateRandomNum();
    int userNum;
    int count = 0;

    do {
      System.out.print("Enter the num: ");
      userNum = input.nextInt();
      count++;

      if (userNum == randomNum) {
        System.out.println("You have entered: " + userNum);
        System.out.println("Congratulations.. You guessed it correctly in " + count + " times");
      } else if (userNum > randomNum) {
        System.out.println("You have entered: " + userNum);
        System.out.println("Your Entered num is greater than the original number\nTry guessing smaller numbers");
      } else {
        System.out.println("You have entered: " + userNum);
        System.out.println("Your Entered num is smaller than the original number\nTry guessing bigger numbers");
      }

    } while (userNum != randomNum);

    input.close();

  }
}
