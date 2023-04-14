class food {
  public String name;
  public int rating;

  food(String name, int rating) {
    this.name = name;
    this.rating = rating;
  }
}

public class this_example {
  public static void main(String[] args) {

    food f1 = new food("samosa", 4);

    System.out.printf("Name: %s \nRating: %d", f1.name, f1.rating);

  }
}
