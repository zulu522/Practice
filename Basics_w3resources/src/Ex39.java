//Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
// Also count how many three-digit numbers are there.
// But I used array

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex39 {
    public static class ThreeDigitNumber {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            //int[] array = IntStream.range(1, 10001).toArray();
            //System.out.println(Arrays.toString(array));

            int amount = 0;
            for (int i : array) {
                for (int j : array) {
                    for (int k : array) {
                        if (k != i && k != j && i != j) {
                            System.out.println(i + "" + j + "" + k);
                            amount++;
                        }
                    }
                }
            }
            System.out.println("amount: "+ amount);
        }
    }
}