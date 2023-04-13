public class ThrowExample {
  public static void main(String[] args) {
    try {
      int result = divide(10, 0);
      System.out.println("Result: " + result);
    } catch (ArithmeticException ex) {
      System.out.println("Exception caught: " + ex.getMessage());
    }
  }

  public static int divide(int num1, int num2) {
    if (num2 == 0) {
      throw new ArithmeticException("Division by zero");
    }
    return num1 / num2;
  }
}
