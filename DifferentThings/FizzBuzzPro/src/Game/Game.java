package Game;

import ArraySequence.ArraySeq1;

import java.util.Scanner;

public class Game extends ArraySeq1 {
    static void game(){
        Scanner scan = new Scanner(System.in);
        System.out.println("FizzBuzz game starts");

        for (String s : array) {
            System.out.println("Make your answer:");
            String answer = scan.nextLine();
            if (answer.equals(s)) {
                System.out.println("You answered right. " + "Your answer was: " + answer);

            }
            else{
                System.out.println("You answered wrong. "+ "Your answer was: " + answer + " Your answer should be: " + s);
            }
        }
    }

    public static void main(String[] args) {
        game();
    }
}
