public class multiThread {
  public static void main(String[] args) {

    Thread T1 = new Thread(() -> {
      System.out.println("T1 is running..");
    });
    Thread T2 = new Thread(() -> {
      System.out.println("T2 is running..");
    });
    Thread T3 = new Thread(() -> {
      System.out.println("T3 is running..");
    });

    T1.start();
    T2.start();
    T3.start();

    System.out.println("main thread is running..");

  }

}
