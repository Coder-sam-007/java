import java.util.Scanner;

public class Exception_Handling {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int[] marks = { 80, 82, 84, 86, 89, 92 };

    try {
      System.out.print("Enter the index of the student to get his/her marks: ");
      int index = in.nextInt();

      System.out.println("marks at index " + index + " is: " + marks[index]);

    } catch (Exception e) {
      System.out.println("An error has occured while accessing the data\nand the error is: " + e.getMessage());
    }
  }
}
