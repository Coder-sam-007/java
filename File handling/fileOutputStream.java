import java.io.FileOutputStream;

public class fileOutputStream {
  public static void main(String[] args) {
    try {
      FileOutputStream fout = new FileOutputStream("Demo.txt");

      fout.write("The Zain".getBytes());
      fout.close();
      System.out.println("success");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
