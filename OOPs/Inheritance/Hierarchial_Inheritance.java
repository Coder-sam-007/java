class Paa {

  String Quality;

  Paa() {
    Quality = "Cooks delicious food\n";
  }

  public void show_quality() {
    System.out.print(Quality);
  }
}

class Son extends Paa {

}

class Daughter extends Paa {

}

public class Hierarchial_Inheritance {

  public static void main(String[] args) {

    Son foo = new Son();
    foo.show_quality();

    Daughter moo = new Daughter();
    moo.show_quality();

  }
}
