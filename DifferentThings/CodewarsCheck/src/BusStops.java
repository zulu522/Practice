import java.util.ArrayList;

public class BusStops {
    public static int countPassengers(ArrayList<int[]> stops) {
        int counterIN = 0;
        int counterOUT;
        for (int[] array : stops) {
            counterIN += array[0];
            counterOUT = array[1];
            //System.out.println(counterIN);
            //System.out.println(counterOUT);
            counterIN -= counterOUT;
            //System.out.println(counterIN);
            //System.out.println("----------------------------");
        }
        System.out.println("The one who sleeps " + counterIN);
        return counterIN;
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{7, 4});
        list.add(new int[]{1, 4});
        list.add(new int[]{2, 2});
        list.add(new int[]{3, 10});
        countPassengers(list);
    }
}

