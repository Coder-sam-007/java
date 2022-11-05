import java.util.ArrayList;
import java.util.HashMap;

public class loops {
  public static void main(String[] args) {

    // sum up to 10 numbers
    int sum = 0;
    for (int i = 0; i <= 10; i++) {
      sum += i;
    }
    System.out.println("Sum of 10 nums is: " + sum);

    // printing odd nums

    System.out.println("Printing odd nums upto 20:");
    for (int i = 0; i <= 20; i++) {
      if (i % 2 == 1) {
        System.out.print(i + " ");
      }
    }

    // array iteration via foreach method

    int nums[] = { 12, 23, 45, 56, 678 };
    System.out.printf("\n\nArray iteration via foreach: ");

    for (int num : nums) {
      System.out.print(num * 100 + " ");
    }

    ArrayList<Integer> mArrayList = new ArrayList<Integer>();

    mArrayList.add(12);
    mArrayList.add(7);
    mArrayList.add(05);
    mArrayList.add(11);
    mArrayList.add(4);

    System.out.print("\n\nPrinting all the elements of an ArrayList: ");

    mArrayList.forEach(num -> {
      System.out.print(num + " ");
    });

    System.out.print("\n\nConverting every elements into square: ");

    mArrayList.forEach(num -> {
      mArrayList.set(mArrayList.indexOf(num), num * num);
    });

    System.out.println(mArrayList.toString() + "\n");

    // hashMap iteration:

    HashMap<String, Integer> priceTabMap = new HashMap<String, Integer>();
    priceTabMap.put("Mobile", 5000);
    priceTabMap.put("Tablet", 10000);
    priceTabMap.put("Laptop", 60000);
    priceTabMap.put("Desktop", 100000);

    priceTabMap.forEach((key, value) -> {
      System.out.println(key + "-> " + value);
    });

  }
}
