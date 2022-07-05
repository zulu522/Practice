//Write a Java program to convert a given string into lowercase.

import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: "); //THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        String line = in.nextLine();

        System.out.println(line.toLowerCase());
    }
}
