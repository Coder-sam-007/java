import java.util.Scanner;

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
     * byte = takes only 1 byte [ -128 to 127]
     * short = 2 bytes
     * int = 4 bytes
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

    boolean edible = false;

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

    // taking inputs

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String namde = input.next();
    System.out.println("Your name is: " + namde);

    System.out.print("Enter your age: ");
    int age = input.nextInt();
    System.out.println("Your age is: " + age);

    System.out.print("Write a quote: ");
    String quote = input.nextLine();
    System.out.println("Your quote is: " + quote);
  }

}
