import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);

        System.out.print("Enter Length and Breadth rescpectively: ");
        int L = foo.nextInt();
        int B = foo.nextInt();

        System.out.print("Area of the rectangle: " + L * B);
        foo.close();

    }
}
