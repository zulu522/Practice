package Game;

import ArraySequence.ArraySeq1;

import java.util.Scanner;

public class Game extends ArraySeq1 {
    static int scoreCounter = 0;
    static void game(String[] array){
        Scanner scan = new Scanner(System.in);
        System.out.println("FizzBuzz game starts");
        for (String s : array) {
            System.out.println("Make your answer:");
            String answer = scan.nextLine();
            if (answer.equals(s)) {
                System.out.println("You answered right. " + "Your answer was: " + answer);
                scoreCounter++;
            }
            else{
                System.out.println("You answered wrong. "+ "Your answer was: "
                        + answer + " Your answer should be: " + s);
                scoreCounter--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Chose a quantity of digits in the game: ");
        Scanner inputArrayLength = new Scanner(System.in);
        int arrayLength;
        arrayLength = inputArrayLength.nextInt();
        String [] array = new String[arrayLength];
        setArray(array);
        game(array);
        System.out.println("Game Over" + "\nYour final score is - " + scoreCounter);
    }
}
