import java.util.ArrayList;

public class Test {
    public static void arrayListsCompare(){
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add(0, "3");
        arrayList1.add(1, "4");
        arrayList1.add(2, "4.5");
        System.out.println("First arrayList: " + arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add(0, "3");
        arrayList2.add(1, "4");
        arrayList2.add(2, "5");
        System.out.println("Second arrayList: " + arrayList2);

        arrayList1.removeAll(arrayList2);
        System.out.println("Different elements: " + arrayList1);


    }

    public static void main(String[] args) {
        arrayListsCompare();
    }
}
