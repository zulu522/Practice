//Write a Java program to display the system time.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex46_47 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm:ss.SSS");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    }
}
