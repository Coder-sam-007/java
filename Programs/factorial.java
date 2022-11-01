public class factorial {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("The factorial of " + num + " is " + facto(num));

    }

    public static int facto(int num) {
        if (num >= 1) {
            return num * facto(num - 1);
        } else {
            return 1;
        }
    }
}