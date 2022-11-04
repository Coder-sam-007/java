public class strings {
  public static void main(String[] args) {
    // Strings
    // strings are immutable, which means we can't change the original string

    String fruit = "apple";

    String fruit2 = new String("banana");

    // some string methods

    System.out.println("the length of the fruit is: " + fruit2.length());
    System.out.println("is the fruit string empty: " + fruit.isEmpty());
    System.out.println("fruit in uppercase: " + fruit.toUpperCase());
    System.out.println("fruit in lowercase: " + fruit.toLowerCase());

    // concatenation = adding two strings..

    String str1 = "sameer";
    String str2 = "jain";

    String str3 = str1 + " " + str2;

    System.out.println("str3 = " + str3);
    System.out.println("letter at positon 2 is: " + str3.charAt(2));

    // checking strings without case sensitivity

    str1 = "sam";
    str2 = "SaM";

    System.out.println("is str1 == str2: " + str1.equalsIgnoreCase(str2));

    // contains property

    String fact = "Sun rises in the east.";
    System.out.println("Does the Sun exist in the fact string: " + fact.contains("Sun"));

    // replace

    String str4 = str3.replace('e', 'i');
    System.out.println(str4);
    System.out.println(fact.replace("Sun", "Moon"));

    /*
     * substring
     * 1st index is included and last index is not included so count normally and
     * put the last index..
     */
    String str5 = str3.substring(0, 6);
    System.out.println(str5);

    /* difference between normal string and string object */

    String name = "sameer";
    String name2 = "sameer";
    String name3 = new String("sameer");

    if (name == name2) {
      System.out.println("name == name2");
    } else if (name == name3) {
      System.out.println("name == name3");
    } else {
      System.out.println("Nothing is same");
    }

    /** String Format Specifier -- %s **/

    /*
     * We generally use printf method to print formatted strings in java
     * We can't use format specifier directly inside the println method
     */

    name = "The zain";
    int age = 19;
    String fav_toy = "crossbow";
    double percent = 80.6f;
    char percentSign = '%';
    Boolean claim = true;

    String details = String.format(
        "%s is %d years old and he likes %s and he scores %.2f%c in his graduation.These all are %b claims", name,
        age,
        fav_toy, percent, percentSign, claim);
    System.out.println(details);

    System.out.printf(
        "%s is %d years old and he likes %s and he scores %.2f%c in his graduation.These all are %b claims", name,
        age,
        fav_toy, percent, percentSign, claim);

  }

}
