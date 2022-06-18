//Write a Java program to compute the area of a hexagon.

import java.util.Scanner;

public class Ex34 {
    static void hexagonAreaComp(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon:");
        double length = scan.nextDouble();

        double area = (6 * Math.pow(length, 2))/(4 * Math.tan(Math.PI/6));
        System.out.println(area);
    }

    public static void main(String[] args) {
        hexagonAreaComp();
    }
}
