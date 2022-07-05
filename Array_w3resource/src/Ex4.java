//Write a Java program to calculate the average value of array elements.

public class Ex4 {
    static void calcAvgValue(){
        int[] array = {4, 6, 87, 45, 2, 121, 57, 78, 2345, 2, 45, 45, 78};
        int avg = 0, count = 0, sum = 0;

        for(int i: array){
            sum += i;
            count++;
        }
        System.out.println(avg = sum/count);
    }

    public static void main(String[] args) {
        calcAvgValue();
    }
}
