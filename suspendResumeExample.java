class MyThread extends Thread {
  public void run() {
    System.out.println("Thread is running");
    // Suspend the thread
    suspend();
    System.out.println("Thread is resumed");
  }
}

public class suspendResumeExample {
  public static void main(String[] args) {
    MyThread t = new MyThread();
    t.start();
    // Sleep for some time
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // Resume the thread
    t.resume();
  }
}
