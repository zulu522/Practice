//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Ex1 {
    static int[] sortNum(int ... i){
        Arrays.sort(i);
        return i;
    }
    static String[] sortString(String ... s){
        Arrays.sort(s);
        return s;
    }

    public static void main(String[] args) {
        int[] array = sortNum(3, 6, 4, 25, 67, 2, 45);
        String[] array1 = sortString("B", "A", "C", "H", "L", "Q");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }
}
