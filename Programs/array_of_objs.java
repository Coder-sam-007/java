class student {
  String name;
  int age;

  student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

public class array_of_objs {
  public static void main(String[] args) {

    int size = 3;
    student[] student_arr = new student[size];

    student_arr[0] = new student("sameer", 20);
    student_arr[1] = new student("prabin", 19);
    student_arr[2] = new student("nurul", 20);

    for (student stud : student_arr) {
      stud.display();
    }
  }
}
