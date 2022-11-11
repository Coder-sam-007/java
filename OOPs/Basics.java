import java.util.Scanner;

class Student {
  String name;
  int roll_no;
  int total_marks;

  Scanner in = new Scanner(System.in);

  public void get_details() {
    System.out.print("Enter your name: ");
    this.name = in.nextLine();

    System.out.print("Enter Your roll no: ");
    this.roll_no = in.nextInt();

    System.out.print("Enter Your totak marks no: ");
    this.total_marks = in.nextInt();

  }

  public void show_details() {
    System.out.printf("%s is a good student, whose roll no. is %d. He has secured %d marks\n", this.name, this.roll_no,
        this.total_marks);
  }
}

public class Basics {
  public static void main(String[] args) {

    Student student1 = new Student();
    student1.name = "Sameer";
    student1.roll_no = 12;
    student1.total_marks = 20;
    student1.show_details();

    Student student2 = new Student();
    student2.get_details();
    student2.show_details();

  }
}
