//Write a Java program to find the size of a specified file.

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex45 {
    public static void main(String[] args) {
        String fileName ="C:/Users/zig/Pictures/2637581.jpg";

        Path path = Paths.get(fileName);
        try{
            long bytes = Files.size(path);
            System.out.println("Size in bytes " + bytes);
            System.out.println("Size in kilobytes " + bytes / 1024);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
