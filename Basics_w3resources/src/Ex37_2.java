import java.util.Scanner;

public class Ex37_2 {
        public static void main(String[] args) {
            //long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a string: ");
            char[] letters = scanner.nextLine().toCharArray();

            System.out.print("Reverse string: ");
            for (int i = letters.length - 1; i >= 0; i--) {
                System.out.print(letters[i]);
            }
            System.out.print("\n");

            //long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

            //long actualMemUsed=afterUsedMem-beforeUsedMem;
           //System.out.println(actualMemUsed);
        }
}

