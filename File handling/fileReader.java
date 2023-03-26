import java.io.FileReader;

public class fileReader {
  public static void main(String[] args) {
    try {
      FileReader fReader = new FileReader("demo.txt");
      int i = 0;

      while ((i = fReader.read()) != -1) {
        System.out.print((char) i);
      }

      fReader.close();
      System.out.println("\nsuccess!");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
