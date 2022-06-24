//Write a Java program and compute the sum of the digits of an integer.

import java.util.Scanner;

public class Ex33 {
    static void mySumDigits1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an integer from 10 to 99");

            int num = scan.nextInt();

            while(num > 99 || num < 10) {
                System.out.println("You enter wrong digit");
                System.out.println("Try again");
                num = scan.nextInt();
            }

            String s = String.valueOf(num);
            char s1 = s.charAt(0);
            char s2 = s.charAt(1);
            int num1 = Character.getNumericValue(s1);
            int num2 = Character.getNumericValue(s2);

            System.out.println("The sum of the digits is: " + (num1 + num2));

    }
    public static int sumDigits() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        int n = input.nextInt();

        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            //System.out.println(sum + "\n");
            n /= 10;
            //System.out.println(n + "\n");
        }
        return sum;
    }

    public static void main(String[] args) {
        mySumDigits1();
        //System.out.println("The sum of the digits is: " + sumDigits());
    }
}
