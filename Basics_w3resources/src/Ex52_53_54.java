//52: Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

//53: Write a Java program that accepts three integers from the user and return true
// if the second number is greater than first number and third number is greater than second number.
// If "abc" is true second number does not need to be greater than first number.

//54: Write a Java program that accepts three integers from the user and
// return true if two or more of them (integers ) have the same rightmost digit.
// The integers are non-negative.

import java.util.Scanner;

public class Ex52_53_54 {
    static boolean calculateEx52() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number :");
        int num1 = scan.nextInt();
        System.out.println("Input the second number :");
        int num2 = scan.nextInt();
        System.out.println("Input the third number :");
        int num3 = scan.nextInt();

        return num3 == num1 + num2;
    }

    static boolean calculateEx53() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number :");
        int num1 = scan.nextInt();
        System.out.println("Input the second number :");
        int num2 = scan.nextInt();
        System.out.println("Input the third number :");
        int num3 = scan.nextInt();


        return num2 > num1 && num3 > num2;
    }

    static boolean calculateEx54(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number :");
        int num1 = scan.nextInt();
        System.out.println("Input the second number :");
        int num2 = scan.nextInt();
        System.out.println("Input the third number :");
        int num3 = scan.nextInt();

        return (num1 % 10 == num2 % 10) || (num2 % 10 == num3 % 10) || (num3 % 10 == num1 % 10);
    }

        public static void main (String[]args){
            //boolean a = calculate();
            //System.out.println(a);

            //boolean b = calculateEx52();
            //System.out.println(b);

            boolean c = calculateEx54();
            System.out.println(c);
        }
    }
