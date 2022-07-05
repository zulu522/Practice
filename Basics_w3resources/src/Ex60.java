//Write a Java program to find the penultimate (next to last) word of a sentence.

import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: "); //The quick brown fox jumps over the lazy dog.
        String line = in.nextLine();

        String[] words = line.split(" +");
        System.out.println("Penultimate word: "+words[words.length - 2]);
    }
}
