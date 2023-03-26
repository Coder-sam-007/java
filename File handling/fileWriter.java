import java.io.FileWriter;

public class fileWriter {
  public static void main(String[] args) {
    try {
      FileWriter fW = new FileWriter("fw.txt");
      fW.write("The zain is writing..");
      fW.close();
      System.out.println("Success!");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
