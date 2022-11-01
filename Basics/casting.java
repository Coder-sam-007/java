public class casting {
  public static void main(String[] args) {
    // casting means converting one form to another..
    // there are two types of casting
    // implicit casting and explicit casting

    // implicit casting -- automatic casting

    Double price = 100.0;
    price += 18;

    System.out.println(price);

    // expliciting casting -- forced casting

    int p = 100;
    p = p + (int) 18.70;
    System.out.println(p);

    float num1 = 5;
    float num2 = 24;

    float num3 = (num2 / num1);
    System.out.println(num3);

  }
}
