import java.util.Scanner;

public class vowel_counter {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String sentence = in.nextLine();

    int count = 0;

    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
          || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
        count++;
      }
    }

    System.out.println("There are " + count + " vowels in the sentence");

    in.close();

  }
}
