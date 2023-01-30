class Car {

  static int wheels = 4;
  String model_name;

}

public class Static {

  public static void main(String[] args) {

    Car foo = new Car();

    foo.model_name = "dsfhf";

    System.out.println(Car.wheels + " " + foo.model_name + " " + foo.wheels);

  }

}
