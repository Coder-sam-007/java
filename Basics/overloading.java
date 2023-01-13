import java.util.Scanner;

public class overloading {

    public static int area(int l, int b) {
        return l * b;
    }

    public static double area(double r) {
        return (3.14 * r * r);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int r = in.nextInt();
        System.out.println("Area of the circle is: " + area(r));

        System.out.println("Enter the lenght and breadth of the rectangle: ");
        int l = in.nextInt();
        int b = in.nextInt();
        System.out.println("Area of the rectangle is: " + area(l, b));

        in.close();
    }
}
