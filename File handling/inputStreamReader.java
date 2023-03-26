import java.io.*;

public class inputStreamReader {
  public static void main(String[] args) {
    try {
      InputStream stream = new FileInputStream("demo.txt");
      Reader reader = new InputStreamReader(stream);
      int data = reader.read();
      while (data != -1) {
        System.out.print((char) data);
        data = reader.read();
      }
      reader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
