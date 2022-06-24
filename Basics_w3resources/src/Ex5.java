import java.util.Scanner;

// Write a Java program that takes two numbers as input and display the product of two numbers.

public class Ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber = scan.nextInt();

        System.out.println("Input second number");
        int secondNumber = scan.nextInt();

        System.out.println("25 * 5 = " + firstNumber * secondNumber);

    }
}
