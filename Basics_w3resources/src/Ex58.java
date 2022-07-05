//Write a Java program to capitalize the first letter of each word in a sentence.

import java.util.Scanner;

public class Ex58 {
    static void capitalizer2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = scan.nextLine();

        String upper_case_line = "";
        Scanner lineScan = new Scanner(line);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());
    }
    public static void main(String[] args) {
        //capitalizer();
        capitalizer2();
    }
}
