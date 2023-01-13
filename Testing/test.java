import java.util.Scanner;

public class test {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter password: ");

    String password = sc.nextLine();

    String mah_password = "Cyclopes";

    if (password.equals(mah_password)) {
      System.out.println("You have entered to the Matrix Succesfully..");
    } else {
      System.out.println("You are a looser..");
    }

    sc.close();

  }
}
