//Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number to check even it or odd: ");
        int number = scan.nextInt();

        if(number % 2 == 0){
            System.out.println("Number is even");
        }
        else
            System.out.println("Number is odd");
    }
}
