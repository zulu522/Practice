//Write a Java program to accepts an integer and count the factors of the number.

import java.util.Scanner;

public class Ex57 {
    static void factorCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to count factors of it: ");
        int num = scan.nextInt();

        int count = 0;
        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                count++;
            }
            System.out.println("Quantity of factors of the entered integer are: " + count);
        }
        System.out.println("Your entered integer: " + num);
        //System.out.println("Quantity of factors of the entered integer are: " + count);
    }
    static void factorCount2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to count factors of it: ");
        int num = scan.nextInt();

        int count = 0;
        for(int j=1; j<=(int)Math.sqrt(num); j++) {
            if(num%j==0 && j*j!=num) {
                count+=2;
            } else if (j*j==num) {
                count++;
            }
            System.out.println(count);
        }
        //System.out.println(count);
    }

    public static void main(String[] args) {
        //factorCount();
        factorCount2();
    }
}

