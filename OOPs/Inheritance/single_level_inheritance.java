import java.util.Scanner;

class Fruit {
  int price;
  int weight;
}

class Apple extends Fruit {
  String type;

  Scanner in = new Scanner(System.in);

  public void getData() {

    System.out.print("Enter the type of the Apple: ");
    this.type = in.nextLine();

    System.out.print("Enter Price: ");
    this.price = in.nextInt();

    System.out.print("Enter Weight: ");
    this.weight = in.nextInt();

  }

  public void show_details() {
    System.out.println("type of the apple is: " + this.type);
    System.out.println("Price : " + this.price);
    System.out.println("Weight: " + this.weight);
  }
}

public class single_level_inheritance {
  public static void main(String[] args) {

    Apple a1 = new Apple();
    a1.getData();
    a1.show_details();

  }
}
