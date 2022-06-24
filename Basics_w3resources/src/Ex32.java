//Write a Java program to compare two numbers.

import java.util.Scanner;

public class Ex32 {

    static void method1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer");
        int num1 = scan.nextInt();
        System.out.println("Enter second integer");
        int num2 = scan.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else {
            System.out.println(num1 + " == " + num2);
        }
    }
    static void method2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer");
        int num1 = scan.nextInt();
        System.out.println("Enter second integer");
        int num2 = scan.nextInt();

        if (num1 == num2)
            System.out.printf("%d == %d\n", num1, num2);
        if (num1 != num2)
            System.out.printf("%d != %d\n", num1, num2);
        if (num1 < num2)
            System.out.printf("%d < %d\n", num1, num2);
        if (num1 > num2)
            System.out.printf("%d > %d\n", num1, num2);
        if (num1 <= num2)
            System.out.printf("%d <= %d\n", num1, num2);
        if (num1 >= num2)
            System.out.printf("%d >= %d\n", num1, num2);
    }

    public static void main(String[] args) {
        //method1();
        method2();
    }
}
