//Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

public class Ex5 {
    static boolean contains() {
        String[] array = {"AB", "BB", "CB", "DB" };

        Scanner in = new Scanner(System.in);
        System.out.println("Insert value to find: ");
        String value = in.nextLine();

        for (String s: array) {
            if (s.equals(value)) {
                return true;
            }
        }
        return false;
    }
    static boolean contains2(int[] array, int value){
        for(int i: array){
            if(value == i){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(contains());

        int[] array = {1, 4, 6, 5, 3, 2, 78, 45};
        //System.out.println(contains2(array, 78));
        //System.out.println(contains2(array, 25));

    }
}
