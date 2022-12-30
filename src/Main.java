import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(15);


        // add all in collection
        Collections.addAll(list, 1, 4, 5);
        // size
        System.out.println("La taille de la collection est :" + list.size());
        // delete from collection
        list.remove(4);
        // clear a list (delete all element)
        // list.clear();
        // verify is an empty list
        System.out.println("La liste est vide ? " + list.isEmpty());
        // contains
        var result = list.contains(3);
        System.out.println("La liste contient 3 ? " + result);
        // casting to Array of Object
        Object[] object = list.toArray();
        // casting to array of Integer
        Integer[] integers = list.toArray(new Integer[5]); // 5 is the length

        // add all in other collection
        Collection<Integer> others = new ArrayList<>();
        others.addAll(list);

        // comparing collection
        System.out.println(others == list); // false : based on memory address
        System.out.println(others.equals(list)); // true : based on content

        // show collection
        for (Integer item: list) {
            System.out.println(item);
        }
    }
}