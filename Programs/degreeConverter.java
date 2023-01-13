import java.util.Scanner;

public class degreeConverter {

    public static float convert_it(float num, int choice) {
        if (choice == 2) {
            return ((num - 32) * 5) / 9;
        } else
            return (num * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner foo = new Scanner(System.in);

        int exit;

        do {
            System.out.print("\n1.Celious to Farenheight\n2.Farenheight to celicious\n\nEnter Your choice:");
            int choice = foo.nextInt();

            if (choice == 1) {

                System.out.print("Enter tempreture in celcious: ");
                float num1 = foo.nextFloat();

                System.out.println("Tempreture in farenheight is: " + convert_it(num1, choice));

            } else if (choice == 2) {
                System.out.print("Enter tempreture in farenheight: ");
                float num2 = foo.nextFloat();

                System.out.println("Tempreture in celcious is: " + convert_it(num2, choice));
            } else {
                System.out.println("Wrong Input");
            }

            System.out.println("press 1 to continue and 0 to exit");
            exit = foo.nextInt();
        } while (exit != 0);

        foo.close();

    }

}
