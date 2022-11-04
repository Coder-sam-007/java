public class swap {

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 24;
        int temp;

        System.out.println("\n\nBefore swapping the numbers are: \n\nnum1: " + num1 + "\nnum2: " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\n\nAfter swapping the numbers are: \n\nnum1: " + num1 + "\nnum2: " + num2);

    }
}
