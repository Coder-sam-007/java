import java.util.Scanner;

public class scn {
    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = foo.nextLine();

        System.out.print("Enter Your roll no: ");
        int roll = foo.nextInt();

        System.out.print("Enter your marks: ");
        float marks = foo.nextFloat();

        System.out
                .println("\nDetails of the students are:\n\n" + "Name: " + name + "\n" + "Roll no: " + roll + "\n"
                        + "Marks: " + marks);

        foo.close();

    }
}
