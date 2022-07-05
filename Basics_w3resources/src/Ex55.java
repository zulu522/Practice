//Write a Java program to convert seconds to hour, minute and seconds.

import java.util.Scanner;

public class Ex55 {
    static void time1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int inputSec = scan.nextInt();

        int seconds = inputSec % 60;
        System.out.println(seconds);

        int hours = inputSec / 60;
        System.out.println(hours);

        int minutes = hours % 60;
        System.out.println(minutes);

        hours = hours / 60;
        System.out.println(hours);

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        time1();
    }
}
