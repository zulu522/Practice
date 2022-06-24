//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 any digits to calculate average number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int averageNum = (num1 + num2 + num3) / 3;
        System.out.println("Average number: " + averageNum);
    }
}
