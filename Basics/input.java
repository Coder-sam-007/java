import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String namde = in.nextLine();

    System.out.printf("Hello %s, what is your age: ", namde);
    int age = in.nextInt();

    in.nextLine(); // cleaning up the input buffer;

    System.out.printf("%d is a perfect age to begin programming.\nTell us which language you want to learn: ", age);

    String language = in.nextLine();
    System.out.printf("%s is a great language to learn.", language);

    in.close();
  }
}

/*
 * While we take input from the user in int or double form then it leaves the
 * enter key and it forwards it to the next input which takes a string.
 * so it automatically puts null value and skips the input taking part
 * 
 * by adding a input buffer solves the problem.
 * 
 * We can also solves this problem by using nextline() method and whenever
 * required we can conver the userInput to int or float data type
 * 
 * ex -- int age = Integer.parseInt(in.nextLine());
 * ex -- double gpa = Double.parseDouble(in.nextLine());
 * 
 */
