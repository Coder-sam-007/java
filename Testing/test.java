import java.io.*;

class shape {
  public void area() {
    System.out.println("It displays area");
  }
}

class triangle extends shape {
  public void area(int b, int h) {
    System.out.println(0.5 * b * h);
  }
}

public class test {
  public static void main(String[] args) {
    triangle t1 = new triangle();
    t1.area();
    t1.area(12, 10);
  }
}
