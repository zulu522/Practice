import java.util.Scanner;

public class Test {

    public static void scanner1(){

        System.out.print("Enter any digit from 1 to 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("You entered digit:5 " + number);
    }

    public static void scanner2(){

        Scanner scan1 = new Scanner(System.in);
        System.out.println ("Enter 2 any digits: ");
        int number1 = scan1.nextInt();                 //считывает первое число и присваивает значение в number1
        int number2 = scan1.nextInt();                 //считывает второе число и присваивает значение в number2
        System.out.print("Sum of 2 digits: " + (number1 + number2));           //выводит сумму number1 + number2
    }

    public static void scanner3(){

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter any phrase or word: ");
        String phrase1 = scan2.nextLine();
        System.out.println(phrase1);
    }

    public static void scanner4(){

        System.out.println("Enter any 2 words or phrases: ");
        Scanner scan3 = new Scanner(System.in);
        String phrase1 = scan3.nextLine();
        String phrase2 = scan3.nextLine();
        System.out.println(phrase1 + " " + phrase2);
    }

    public static void scanner5(){

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Enter any word or phrase: ");
        String phrase1 = scan4.next();           // выводит только до первого пробела
        System.out.println(phrase1);
    }








    public static void main(String[] args){
        //scanner1();
        //scanner2();
        //scanner3();
        //scanner4();
        scanner5();
        }
}
