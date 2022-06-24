import java.util.Scanner;

//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first number"); //125
        int firstNumber = scan.nextInt();

        System.out.println("Input second number"); //24
        int secondNumber = scan.nextInt();

        System.out.println("125 + 24 = " + (firstNumber + secondNumber));
        System.out.println("125 - 24 = " + (firstNumber - secondNumber));
        System.out.println("125 * 24 = " + firstNumber * secondNumber);
        System.out.println("125 / 24 = " + firstNumber / secondNumber);
        System.out.println("125 mod 24 = " + firstNumber % secondNumber);
    }
}
