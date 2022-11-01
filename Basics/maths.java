public class maths {
  public static void main(String[] args) {
    int num1 = 12;
    double num2 = 12D;
    float num3 = 12.00F;
    System.out.println(Math.max(num3, num1));

    double num4 = 123, num5 = 344444;
    System.out.println(Math.min(num4, num5));

    // generating random nums;
    // math.random() produces random number between 0.0 to 1.0

    System.out.println(Math.random());
    System.out.println(Math.random() * 100);
    System.out.println((int) Math.ceil(Math.random() * 100));
  }
}
