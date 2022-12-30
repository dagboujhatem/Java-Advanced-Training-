import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // The Queue interface
        // You can use PriorityQueue ("PriorityQueue" => "File d'attente prioritaire")
        // or you can use (i.e ArrayDeque "Array double ended queue" => "File d'attente à double extrémité")
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println(queue);

        // add new item in the queue
        queue.add(5);
        System.out.println(queue);

        // add in the queue (2nd way) but it return a status "true/false" of adding
        // Raison : parfois la taillé des queue sont limité
        // return true if the adding new item in the queue or false if is not possibly to add this item
        boolean isAddedSuccessfully = queue.offer(6);
        System.out.println(isAddedSuccessfully);
        System.out.println(queue);

        // get the first element in the queue or throw new exception "NoSuchElementException" if the queue is empty
        Integer result = queue.element();
        System.out.println(result);

        // get the fist element in the queue or null if the queue is empty
        Integer peek = queue.peek();
        System.out.println(peek);

        // remove the first element in the queue or throw new exception "NoSuchElementException" if the queue is empty
        queue.remove();
        System.out.println(queue);

        // remove the first element in the queue or null if the queue is empty
        queue.poll();
        System.out.println(queue);


    }
}