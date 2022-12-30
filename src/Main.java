import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        list.add(5);
        list.add(15);
        // 1st way to parcourir une liste
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // énd way to parcourir une liste
        for (Integer item: list) {
            System.out.println(item);
        }
    }
}