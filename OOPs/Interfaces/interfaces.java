interface Animal {
  int eyes = 2;

  void walk();
}

class horse implements Animal {
  public void walk() {
    System.out.println("horse walks on two legs");
  }
}

public class interfaces {
  public static void main(String[] args) {

    horse foo = new horse();
    foo.walk();

  }
}
