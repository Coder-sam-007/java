import java.io.*;
import java.util.Scanner;

public class filewriting {
  public static void main(String[] args) {

    Scanner inpo = new Scanner(System.in);

    try {

      System.out.print("Enter the file name with extension: ");
      String name = inpo.nextLine();

      FileOutputStream fout = new FileOutputStream(name);

      System.out.print("Enter Your desired String: ");
      String str = inpo.nextLine();

      byte B[] = str.getBytes();
      fout.write(B);

      fout.close();

      System.out.println("Successfully written your desired string in the file");

    } catch (Exception e) {
      System.out.println(e);
    }

    inpo.close();

  }
}
