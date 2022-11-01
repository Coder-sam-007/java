import java.util.Scanner;

public class purchasePower {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter the amount of money you have: ");
    int totalMoney = inp.nextInt();

    int bookPrice = 100;
    int penPrice = 10;

    if (totalMoney >= bookPrice + penPrice) {
      System.out.println("you can buy both i.e book and pen");
    } else if (totalMoney >= bookPrice && totalMoney < bookPrice + penPrice) {
      System.out.println("you can either buy the book or the pen");
    } else if (totalMoney >= penPrice && totalMoney < bookPrice) {
      System.out.println("You can only buy a pen");
    } else {
      System.out.println("Sorry.. you don't have enough money to buy anything");
    }

  }
}
