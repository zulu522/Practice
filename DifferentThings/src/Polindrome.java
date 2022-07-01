import java.util.Arrays;
import java.util.Scanner;

public class Polindrome {
    public static void s() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter polindrom");
        String s = scanner.nextLine();
        StringBuilder r = new StringBuilder(s);
        r.reverse();
        if (s.toLowerCase().equals(r.toString().toLowerCase())) {
            System.out.println("Well Done");
        } else {
            System.out.println("Fuck You, Dude");
        }
    }

    public static void p() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        String original = in.nextLine();

        StringBuilder reversed = new StringBuilder();
        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reversed.append(original.charAt(i));
        if (original.equals(reversed.toString()))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }

    public static void main(String[] args) {
        p();
    }
}

