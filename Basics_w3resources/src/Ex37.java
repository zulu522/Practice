//Write a Java program to reverse a string.

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        //long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();


        Scanner inputString = new Scanner(System.in);
        System.out.println("Input any string:");
        String s = inputString.nextLine();

        StringBuilder sb1 = new StringBuilder(s);
        sb1.reverse();
        System.out.println(sb1);

        //long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();


        //long actualMemUsed=afterUsedMem-beforeUsedMem;
        //System.out.println(actualMemUsed);
    }
}
