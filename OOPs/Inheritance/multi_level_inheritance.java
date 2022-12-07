class GrandPa {
  GrandPa() {
    System.out.println("GrandPa message: Code Well");
  }
}

class Pa extends GrandPa {
  Pa() {
    System.out.println("Pa message: Play Well");
  }
}

class Child extends Pa {
  Child() {
    System.out.println("Child message: Don't wanna do anything..");
  }
}

public class multi_level_inheritance {
  public static void main(String[] arguments) {
    Child C = new Child();

  }
}