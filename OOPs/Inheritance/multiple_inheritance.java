interface Animal {
  int eyes = 2;

  void walk();
}

interface Herbivore {

  String foods = "veggies";

}

class horse implements Animal, Herbivore {
  public void walk() {
    System.out.println("horse walks on two legs");
  }

  public void eats() {
    System.out.println("it only eats " + foods);
  }
}

public class multiple_inheritance {
  public static void main(String[] args) {

    horse foo = new horse();
    foo.walk();
    foo.eats();

  }
}
