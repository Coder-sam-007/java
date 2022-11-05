import java.util.HashMap;

public class hashmap {
  public static void main(String[] args) {
    HashMap<String, Integer> studentsMark = new HashMap<String, Integer>();

    studentsMark.put("Sameer", 82);
    studentsMark.put("prabin", 98);
    studentsMark.put("nurul", 92);
    studentsMark.put("Shivaji", 95);

    System.out.println("Students Mark: " + studentsMark.toString());

    // another nice way to put stuff:
    studentsMark.putIfAbsent("aman", 90);

    // replacing the data:
    studentsMark.replace("prabin", 98, 85);
    studentsMark.replace("Sameer", 90);

    // removing the data:
    studentsMark.remove("prabin");

    System.out.println("Students Mark: " + studentsMark.toString());

    // getting the data:
    System.out.println("Sameer's Mark: " + studentsMark.get("Sameer"));
    System.out.println("Akash's Mark: " + studentsMark.getOrDefault("Akash", 0));

    // checking STUFF:
    System.out.println("HasMap Size: " + studentsMark.size());

    System.out.println("Is Sameer on the list: " + studentsMark.containsKey("Sameer"));
    System.out.println("Does anyone get 98 marks: " + studentsMark.containsValue(95));
    System.out.println("is our studetnMarks empty: " + studentsMark.isEmpty());

    // Updating the whole hashmap:

    studentsMark.forEach((student, mark) -> {
      studentsMark.replace(student, mark + 2);
    });

    System.out.println("Updated Students Mark: " + studentsMark.toString());

    // clearing the Hashmap:
    studentsMark.clear();
    System.out.println("HasMap cleared: " + studentsMark.toString());

  }
}
