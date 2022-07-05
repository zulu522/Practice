//Write a Java program to sum values of an array.

public class Ex2 {
    public static void main(String[] args) {
        int[] array = {1, 5, 452, 45, 23};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }
}
