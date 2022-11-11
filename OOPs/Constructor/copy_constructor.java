
class library {
  int no_of_shelves;
  int no_of_books;

  library(int no_of_shelves, int no_of_books) {
    this.no_of_shelves = no_of_shelves;
    this.no_of_books = no_of_books;
  }

  library(library l0) {
    this.no_of_shelves = l0.no_of_shelves;
    this.no_of_books = l0.no_of_books;
  }

  public void show_data() {
    System.out.println("no_of_shelves: " + no_of_shelves);
    System.out.println("no_of_books: " + no_of_books);
  }
}

public class copy_constructor {
  public static void main(String[] args) {

    library l1 = new library(4, 100);
    library l2 = new library(l1);

    l2.show_data();

  }
}
