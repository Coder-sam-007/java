public class maths {
  public static void main(String[] args) {
    int num1 = 12;
    double num2 = 12D;
    float num3 = 12.00F;

    System.out.println("double num2: " + num2);
    System.out.println("maximum between num3(12.00F) and num1(12) is: " + Math.max(num3, num1));

    double num4 = 123, num5 = 344444;
    System.out.println("minimum value between 123 and 344444 is: " + Math.min(num4, num5));

    // generating random nums;
    // math.random() produces random number between 0.0 to 1.0

    System.out.println("Generating random stuff: ");
    System.out.println(Math.random());
    System.out.println(Math.random() * 100);
    System.out.println((int) Math.ceil(Math.random() * 100));
  }
}
