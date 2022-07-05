//Write a Java program to print the following grid.
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        char[] array = new char[100];
        Arrays.fill(array,'-');
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}
