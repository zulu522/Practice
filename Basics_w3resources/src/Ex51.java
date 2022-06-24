//Write a Java program to convert a string to an integer in Java.

import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number(string)");
        String s = scan.nextLine();
        int a = Integer.parseInt(s);
        System.out.printf("The integer value is: %d", a);
    }
}
