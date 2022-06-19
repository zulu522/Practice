//Write a Java program to compute the area of a polygon.

import java.util.Scanner;

public class Ex35 {
    static double polygonAreaComp(double numberOfSides, double lengthOfSide){
        return (numberOfSides * Math.pow(lengthOfSide, 2)) / (4*Math.tan(Math.PI / numberOfSides));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number of sides on the polygon:");
        double numberOfSides = scan.nextDouble();

        System.out.println("Input the length of one of the sides:");
        double lengthOfSide = scan.nextDouble();

        System.out.println("The area of the polygon is: " + polygonAreaComp(numberOfSides, lengthOfSide));
    }
}
