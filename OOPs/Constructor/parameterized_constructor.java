import java.util.Scanner;

class people {

  String name;
  int age;
  String Category;
  int salary;
  int marks;

  people(String Category) {
    this.Category = Category;
  }

  Scanner in = new Scanner(System.in);

  public void get_details() {
    System.out.print("Enter your name: ");
    this.name = in.nextLine();

    System.out.print("Enter your age: ");
    this.age = in.nextInt();
    in.nextLine(); // clearing input buffer

    if (Category == "student") {
      System.out.print("Enter Your marks: ");
      this.marks = in.nextInt();
    } else {
      System.out.print("Enter Your salary: ");
      this.salary = in.nextInt();
    }
  }

  public void show_details() {
    System.out.println("\nName: " + name);
    System.out.println("Age: " + age);
    System.out.println("Category: " + Category);

    if (Category == "student") {
      System.out.println("Marks: " + marks);
    } else
      System.out.println("Salary: " + salary);
    System.out.println("");
  }

}

public class parameterized_constructor {
  public static void main(String[] args) {

    people p1 = new people("student");
    p1.get_details();
    p1.show_details();

    people p2 = new people("employee");
    p2.get_details();
    p2.show_details();

  }
}
