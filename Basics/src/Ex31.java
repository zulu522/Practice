//Write a Java program to check whether Java is installed on your computer.

public class Ex31 {
    public static void main(String[] args) {
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("\nJava Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("\nJava Home: " + System.getProperty("java.home"));
        System.out.println("\nJava Vendor: " + System.getProperty("java.vendor"));
        System.out.println("\nJava Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("\nJava Class Path: " + System.getProperty("java.class.path"));
    }
}
