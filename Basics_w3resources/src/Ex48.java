//Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.

public class Ex48 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 99){
            i++;
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
        for(int j = 1; j <= 99; j++){
            if(j % 2 != 0){
                System.out.println(j);
            }
        }




    }
}
