public class Basic {
  public static void main(String[] args) {

    System.out.print("hey everyone..."); // this print stuffs without creating a new line

    System.out.println("Welcome to the java world..");
    // println helps to print stuff and it creates a new line too

    // variables..

    // string name = 'sameer'; => shows errors as strings are always stored in
    // double quotes and the 1st letter of the word "string" should be capital.

    String name = "The zain";

    // assigning values of a variable to a different variable

    String myName = name;
    System.out.println(myName);

    /*
     * primitive data types
     * 
     * byte = 1 byte [ -128 to 127] stores upto 100
     * short = 2 bytes = -32,768 to 32,767
     * int = 4 bytes -2147483648 to 2147483647
     * float = 4 bytes
     * long = 8 bytes
     * char = 2 bytes
     * boolean = 1 byte
     * 
     */

    byte var1 = 12;
    byte var2 = 's';

    short var3 = 90;
    int num1 = 536890909;

    // We need to use capital or small L/F after writing the value
    // in order to tell the compiler that it's a long or float

    long num2 = 5368710679L;
    float num3 = 123.99F;

    // char can store all letters and symbols too..
    char symbol = '@';
    char copyright = '\u00A9';

    boolean edible = false;

    System.out.println("var1: " + var1 +
        "\nvar2: " + var2 +
        "\nvar3: " + var3 +
        "\nnum1: " + num1 +
        "\nnum2: " + num2 +
        "\nnum3: " + num3 +
        "\nsymbol: " + symbol +
        "\ncopyright: " + copyright +
        "\nedible: " + edible);

    /*
     * Non-primitive data types
     * 
     * we can perform certain operations on non-primitve data-types
     * These are also called refrence types because they refer to objects
     * We should use new keyword to use non-primitve data types
     * 
     * examples = Strings, Arrays, Classes, Interfaces
     */

    // constants

    final float PI = 3.14F;

    System.out.println(PI + " is a constat.");
  }

}
