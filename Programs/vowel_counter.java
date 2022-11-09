public class vowel_counter {
  public static void main(String[] args) {
    char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', };
    String sentence = "Time is the god of infinity";

    System.out.println(sentence);

    int count = 0;

    for (int i = 0; i < vowels.length; i++) {
      if (sentence.contains("i")) {
        count++;
      }
    }

    System.out.println("The no. of i present in the above sentece is: " + count);

  }
}
