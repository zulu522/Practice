//Write a Java program to print the area and perimeter of a circle.

public class Ex11 {
    public static void main(String[] args) {
        double Radius = 7.5;
        double Perimeter = 2 * Math.PI * Radius;
        double Area = Math.PI * Radius * Radius;

        System.out.println(Perimeter);
        System.out.println(Area);

    }
}
