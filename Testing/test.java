import java.io.*;

public class test {

  public static void main(String[] args) {

    try {
      FileOutputStream Fout = new FileOutputStream("abc.docx");

      String s = "The Zain";
      byte b[] = s.getBytes();

      Fout.write(b);
      Fout.close();

      System.out.println("Success");

    } catch (Exception e) {
      System.out.println(e.getLocalizedMessage());
    }

  }
}
