
abstract class Animal {
  abstract void walk();

  Animal() {
    System.out.println("A new animal was created");
  }
}

class horse extends Animal {
  public void walk() {
    System.out.println("walks on 4 legs");
  }

  horse() {
    System.out.println("horse was created");
  }
}

class kangaroo extends Animal {
  public void walk() {
    System.out.println("walks on 2 legs");
  }
}

public class Abstract {
  public static void main(String[] args) {

    horse foo = new horse();
    foo.walk();

  }
}
