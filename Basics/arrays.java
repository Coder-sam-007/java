import java.util.Arrays;

public class arrays {
  public static void main(String[] args) {

    int[] marks = new int[4];

    marks[0] = 38;
    marks[1] = 12;
    marks[2] = 88;

    System.out.println("marks array: " + marks); // it doesn't print the whole array
    System.out.println("Printing array by converting it to string: " + Arrays.toString(marks));

    for (int i = 0; i < marks.length; i++) {
      System.out.println("marks[" + i + "] = " + marks[i]);
    }

    // uninitialised values are automatically initialised to 0 or null or false

    // directly initialising arrays:

    int[] nums = { 23, 556, 87, 34, 53, 23 };
    System.out.println("nums array: " + nums); // if we directly print array it show a garbage value

    // 2D array

    int array_2D[][] = { { 12, 34, 69 }, { 45, 67, 89 } };

    System.out.println("Printing a 2d array: ");

    int row = array_2D.length;
    int col = array_2D[0].length;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(array_2D[i][j] + " ");
      }
      System.out.println(" ");
    }

    /* some array prperties: */

    // length is a property in arrays whereas it is a method in strings
    System.out.println(marks.length);

    // sorting
    Arrays.sort(marks);

    System.out.println("\nAfter sorting: ");

    for (int i = 0; i < marks.length; i++) {
      System.out.println("marks[" + i + "] = " + marks[i]);
    }

    // sorting arrays in range:

    int numArr[] = { 12, 89, 195, 49, 18, 39 };
    int startIndex = 2; // starting point
    int lastIndex = 5; // ending point -- it leaves the lastIndex so +1

    Arrays.sort(numArr, startIndex, lastIndex);

    System.out.println("sorting a range: " + Arrays.toString(numArr));

    /*
     * searching..
     * before searching don't forget to sort the array
     * we can also do binary search within a range in a similar method.
     * if the item is not found then it returns a -ve value
     */

    int key = 49;
    int foundIndex = Arrays.binarySearch(numArr, key);
    System.out.println("key found at: " + foundIndex);

    // fill method

    key = 69;
    startIndex = 1;
    lastIndex = 5;

    // Arrays.fill(numArr, key); -- it fills completely
    Arrays.fill(numArr, startIndex, lastIndex, key);
    System.out.println("Array is filled with fill method: " + Arrays.toString(numArr));

    /*
     * Copying arrays doesn't really copy the whole array.
     * it just points towards it..
     * To actually copy an array we need to use copy method
     * We can also copy a range of arr via copyOfRange method
     */

    int nArr[] = { 12, 23, 45, 56, 78 };
    int copy_nArr[] = nArr;
    int realCopy[] = Arrays.copyOf(nArr, nArr.length);
    int rangeCopy[] = Arrays.copyOfRange(nArr, startIndex, lastIndex);

    Arrays.fill(nArr, 69);
    System.out.println("The fake copied arr: " + Arrays.toString(copy_nArr));
    System.out.println("The real copied arr: " + Arrays.toString(realCopy));
    System.out.println("The ranged copied arr: " + Arrays.toString(rangeCopy));

    /*
     * comparing arrays:
     * We can't compare array via == symbols as it will alwasys false
     * We use Arrays.equals method to compare between two arrays
     */

    char charArr[] = { 'a', 'b', 'c', 'd' };
    char charArr2[] = Arrays.copyOf(charArr, charArr.length);
    System.out.println("Comparing arrays via equals method: " + Arrays.equals(charArr, charArr2));
  }
}
