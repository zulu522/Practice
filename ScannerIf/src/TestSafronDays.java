import java.util.Scanner;

public class TestSafronDays {

    static void days() {
        System.out.println("1 - Monday, 2 - Tuesday, 3 - Wednesday, 4 - Thursday, 5 - Friday, 6 - Saturday, 7 - Sunday");
        System.out.println("Enter digit from 1 to 7 to chose the day");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();


        while (day != 1 && day != 2 && day != 3 && day != 4 && day != 5 && day != 6 && day != 7) {
            System.out.println("You enter wrong digit");
            System.out.println("Try again");
            day = scanner.nextInt();
        }
            if (day == 1) {
                System.out.println("You chose Monday");
            } else if (day == 2) {
                System.out.println("You chose Tuesday");
            } else if (day == 3) {
                System.out.println("You chose Wednesday");
            } else if (day == 4) {
                System.out.println("You chose Thursday");
            } else if (day == 5) {
                System.out.println("You chose Friday");
            } else if (day == 6) {
                System.out.println("You chose Saturday");
            } else if (day == 7) {
                System.out.println("You chose Sunday");
            }


        System.out.println("Do you wanna chose again ?");
        System.out.println("Enter Yes or No to proceed");
        Scanner scanner1 = new Scanner(System.in);
        String yaNo = scanner1.nextLine();

        while (!yaNo.equals("Yes") && !yaNo.equals("No")) {
            System.out.println("You enter wrong word");
            System.out.println("Try again");
            yaNo = scanner1.nextLine();
        }

        if (yaNo.equals("Yes"))
        System.out.println("You agreed to chose again");

        else if (yaNo.equals("No"))
              System.out.println("You denied to chose again");


    }
        public static void main (String[]args){
            days();
    }
}