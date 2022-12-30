import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        GenericList<String> myList = new GenericList<String>();

        myList.add("hello");
        String itemOne = myList.get(0);
        System.out.println(itemOne);

        // add a new string
        myList.add("hello");
        String itemTwo = myList.get(1);
        System.out.println(itemTwo);

    }
}