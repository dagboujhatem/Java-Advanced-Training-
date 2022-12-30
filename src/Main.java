import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // construction a Set based on an list (to take only distinct elements)
        List<Integer> myList = Arrays.asList(3,5,6,5,6,1);
        Set<Integer> mySet = new HashSet<>(myList);
        // construction a Set based on add metod
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(5);
        set.add(15);
        set.add(15);

        // show a set
        for (Integer item: set) {
            System.out.println(item);
        }

        // Union with distinct criteria (i.e faire la fusion en gardant que les éléments disticts)
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));
        set1.addAll(set2);
        System.out.println(set1);

        // Intersection in two sets (i.e garder que les element qui sont dans les deux sets)
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1,2,3,7));
        Set<Integer> set4 = new HashSet<>(Arrays.asList(3,4,5,7));
        set3.retainAll(set4);
        System.out.println(set3);

        // Differance in two sets (i.e garder que les element qui ne sont pas dans les deux sets)
        Set<Integer> set5 = new HashSet<>(Arrays.asList(1,2,3,7));
        Set<Integer> set6 = new HashSet<>(Arrays.asList(3,4,5,7));
        set5.removeAll(set6);
        System.out.println(set5);
    }
}