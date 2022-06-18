//Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number from 1 to 10");
        int num = scan.nextInt();
        while (num<1 || num>10){
            System.out.println("You enter wrong number");
            System.out.println("Try again");
            num = scan.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(num + " x " + i + " = ");
            System.out.println(num * i);
        }
    }
}
