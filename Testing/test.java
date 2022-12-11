import java.util.Scanner;

public class test {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String str = "SoftwareEngineerTestingEngineerHelp";

    String[] splits = str.split("");

    for (String string : splits) {
      System.out.println(string);
    }

    sc.close();

  }
}
