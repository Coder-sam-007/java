import java.util.Scanner;

class Employee {
  String name;
  int age;
  String department;
  int salary;
  static int no_of_employee;

  Employee() {
    no_of_employee++;
    salary = 1000;
    System.out.printf("Employee %d is creating...\n", no_of_employee);
  }

  Scanner in = new Scanner(System.in);

  public void get_details() {
    System.out.print("Enter your name: ");
    this.name = in.nextLine();

    System.out.print("Enter your age: ");
    this.age = in.nextInt();
    in.nextLine(); // clearing input buffer

    System.out.print("Enter Your department: ");
    this.department = in.nextLine();

    System.out.printf("\nEmployee %d created successfully\n\n", no_of_employee);
  }

  public void show_details() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Department: " + department);
    System.out.println("Salary: " + salary);
    System.out.println("");
  }

  public static int total_employee() {
    return no_of_employee;
  }

}

public class constructors {
  public static void main(String[] args) {

    Employee employee1 = new Employee();
    employee1.get_details();
    Employee employee2 = new Employee();
    employee2.get_details();
    Employee employee3 = new Employee();
    employee3.get_details();
    Employee employee4 = new Employee();
    employee4.get_details();
    Employee employee5 = new Employee();
    employee5.get_details();

    employee1.show_details();
    employee2.show_details();
    employee3.show_details();
    employee4.show_details();
    employee5.show_details();

    System.out.println("Total no. of employees are: " + Employee.no_of_employee);

  }
}
