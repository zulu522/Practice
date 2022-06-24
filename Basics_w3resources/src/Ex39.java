//Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
// Also count how many three-digit numbers are there.
// But I used array

public class Ex39 {
    public static class ThreeDigitNumber {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6};
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
            System.out.println(amount);
        }
    }
}