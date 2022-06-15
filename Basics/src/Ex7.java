//Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        boolean b = false;
        while (!b) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number from 2 to 9");
        int num = scan.nextInt();
        int result = 0;


            if (num <= 9 && num >= 2) {
                for (int i = 2; i <= 9; i++) {
                    result = num * i;
                    System.out.println(num + " x " + i + " = " + result);
                }

            }

            if(num < 2 || num > 9){
                    System.out.println("Yoy are idiot");
                }

        }
    }
}
