//Write a Java program to list the available character sets in charset objects.

import java.nio.charset.Charset;

public class Ex40 {
    public static void main(String[] args) {
        for(String str: Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
