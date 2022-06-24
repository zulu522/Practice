//52: Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

//53: Write a Java program that accepts three integers from the user and return true
// if the second number is greater than first number and third number is greater than second number.
// If "abc" is true second number does not need to be greater than first number.


import java.util.Scanner;

public class Ex52_53_54 {
    static boolean calculate() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number :");
        int num1 = scan.nextInt();
        System.out.println("Input the second number :");
        int num2 = scan.nextInt();
        System.out.println("Input the third number :");
        int num3 = scan.nextInt();

        return num3 == num1 + num2;
    }

    static boolean calculate1() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number :");
        int num1 = scan.nextInt();
        System.out.println("Input the second number :");
        int num2 = scan.nextInt();
        System.out.println("Input the third number :");
        int num3 = scan.nextInt();


        return num2 > num1 && num3 > num2;
    }

        public static void main (String[]args){
            //boolean a = calculate();
            //System.out.println(a);

            boolean b = calculate1();
            System.out.println(b);
        }
    }
