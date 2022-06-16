//Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number: 8");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print("8 * " + i + " = ");
            System.out.println(num * i);
        }
        
        //OUTER:
        //for (int i = 1; i <= 10; i++) {
           // INNER:
          //  for (int i1 = 1; i1 <= 10; i1++) {
              //  System.out.print("8 * " + i + " = ");
               // System.out.println(num * i);
               // continue OUTER;
            //}
        //}
    }
}
