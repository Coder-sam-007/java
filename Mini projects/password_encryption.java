import java.util.Scanner;

public class password_encryption {

  public static int randomNum() {
    String codes = "abcdefghiklmnopqrstuvwxyz1234567890!@#$%^&*()";
    return (int) Math.floor(Math.random() * codes.length());
  }

  public static String EncryptPassword(String password) {

    String Encrypted_string = " ";
    String codes = "abcdefghiklmnopqrstuvwxyz1234567890!@#$%^&*()";
    System.out.println(codes.split(" "));

    return Encrypted_string;
  }

  public static void main(String[] args) {
    Scanner foo = new Scanner(System.in);

    System.out.print("Enter your password: ");
    String password = foo.nextLine();

    System.out.println("Your encrypted password is: " + EncryptPassword(password));

    foo.close();

  }
}
