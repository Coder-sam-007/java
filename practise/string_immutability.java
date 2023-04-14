public class string_immutability {
  public static void main(String[] args) {

    String str1 = "Hello";
    String str2 = str1;

    System.out.println("Before modification:");
    System.out.println("str1: " + str1);
    System.out.println("str2: " + str2);

    str1 = str1 + " World"; // A new String object is created and assigned to str1

    System.out.println("After modification:");
    System.out.println("str1: " + str1); // str1 has changed
    System.out.println("str2: " + str2); // str2 remains unchanged

  }
}
