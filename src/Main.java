import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(15);
        list.add(15);
        // add in an specific index
        list.add(0, 10); // insertion en index=0 et décalage des items à droite

        // remove based on the index of elements
        list.remove(2);

        // index of
        int firstIndex = list.lastIndexOf(15); // return -1 dans le cas ou 15 n'existe pas dans list
        System.out.println("La dernière index de l'element 15 est: " + firstIndex);

        // last index of
        int lastIndex = list.lastIndexOf(15); // return -1 dans le cas ou 15 n'existe pas dans list
        System.out.println("La dernière index de l'element 15 est: " + lastIndex);

        // direct access to this list
        System.out.println("The first elmeent is : " + list.get(0));

        // create a sub list
        List<Integer> subList = list.subList(0, 2);

        // show list
        for (Integer item: list) {
            System.out.println(item);
        }
    }
}