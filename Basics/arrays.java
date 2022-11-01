import java.util.Arrays;

public class arrays {
  public static void main(String[] args) {

    int[] marks = new int[4];

    marks[0] = 38;
    marks[1] = 12;
    marks[2] = 88;

    System.out.println(marks); // it doesn't print the whole array

    for (int i = 0; i < marks.length; i++) {
      System.out.println("marks[" + i + "] = " + marks[i]);
    }

    // uninitialised values are automatically initialised to 0 or null or false

    // some array prperties:

    System.out.println(marks.length);
    Arrays.sort(marks);

    System.out.println("\nAfter sorting: ");

    for (int i = 0; i < marks.length; i++) {
      System.out.println("marks[" + i + "] = " + marks[i]);
    }

    // directly initialising arrays:

    int[] nums = { 23, 556, 87, 34, 53, 23 };

    int array_2D[][] = { { 12, 34, 69 }, { 45, 67, 89 } };

    // printing 2D array

    for (int i = 0; i < array_2D.length; i++) {
      for (int j = 0; j < array_2D[i].length; j++) {
        System.out.print(array_2D[i][j] + " ");
      }
      System.out.println("");
    }
  }
}
