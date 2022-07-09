import java.util.ArrayList;
import java.util.List;

public class IntRemove {
    public static List<Object> filterList1(final List<Object> list) {
        list.removeIf(obj -> obj instanceof Integer);
        return list;
    }
    public static List<Object> filterList2(final List<Object> list) {
        ArrayList<Object> list2 = new ArrayList<>();
        for(Object obj: list){
            if(obj instanceof Integer){
                list2.add(obj);
            }
        }
        System.out.println(list2);
        return list2;
    }


    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add("a");
        list.add("b");
        list.add(0);
        list.add(15);
        //System.out.println(list);

        filterList2(list);
        //System.out.println(filterList2(list));
    }
}
