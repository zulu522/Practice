//Write a Java program to find the number of values in a given range divisible by a given value.

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Define range of numbers: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Define divisible value: ");
        int p = scan.nextInt();
        int count = 0;
        for(int i = x; i <= y; i++){
            if(i % p == 0){
                count++;
            }
        }
        System.out.println("Number of values in a given range between " + x + " and " + y + " divisible by " + p + " is: "+ count);
    }
}
