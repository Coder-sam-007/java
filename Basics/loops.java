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

    

  }
}
