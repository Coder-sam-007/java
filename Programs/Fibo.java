public class Fibo {
  public static void main(String[] args) {
    int t1 = 0, t2 = 1, t3, lim = 10;

    System.out.print("fibonaaci series: " + t1 + " " + t2);

    for (int i = 3; i <= lim; i++) {
      t3 = t1 + t2;
      System.out.print(" " + t3);
      t1 = t2;
      t2 = t3;
    }
  }
}
