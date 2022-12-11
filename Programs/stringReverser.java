import java.util.Scanner;

public class stringReverser {

    public static StringBuffer rev_via_buffer(String str) {

        StringBuffer StrOBJ = new StringBuffer(str);
        StringBuffer revStr = StrOBJ.reverse();

        return revStr;
    }

    public static StringBuilder rev_via_builder(String str) {

        StringBuilder StrOBJ = new StringBuilder(str);
        StringBuilder revStr = StrOBJ.reverse();

        return revStr;
    }

    public static String revString(String str) {

        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }

        return revStr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = in.nextLine();

        System.out.println("Reverse of your entered string through StringBuffer class: " + rev_via_buffer(str));

        System.out.println("Reverse of your entered string through StringBuilder class: " + rev_via_builder(str));

        System.out.println("Reverse of your entered string is: " + revString(str));

        in.close();

    }
}
