public class strings {
  public static void main(String[] args) {
    // Strings
    // strings are immutable, which means we can't change the original string

    String fruit = "apple";

    String fruit2 = new String("banana");

    // some string methods

    int fruitLength = fruit2.length();

    // concatenation = adding two strings..

    String str1 = "sameer";
    String str2 = "jain";

    String str3 = str1 + " " + str2;

    System.out.println("str3 = " + str3);
    System.out.println("letter at positon 2 is: " + str3.charAt(2));

    // replace

    String str4 = str3.replace('e', 'i');
    System.out.println(str4);

    /*
     * substring
     * 1st index is included and last index is not included so count normally and
     * put the last index..
     */
    String str5 = str3.substring(0, 6);
    System.out.println(str5);

  }
}
