import java.util.Scanner;

public class Test {
    static void days(){
        System.out.println("Chose day of the week: ");
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();

        while(!day.equals("Monday") && !day.equals("Sunday")){
            System.out.println("Enter another day");
            day = scan.nextLine();
        }
        if(day.equals("Monday"))
            System.out.println("You are working today");
        else if(day.equals("Sunday"))
            System.out.println("You are off today");
    }

    public static void main(String[] args) {
        days();
    }
}
