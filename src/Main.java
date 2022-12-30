import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        GenericList<BankAccount> myList = new GenericList();

        myList.add(new BankAccount());
        BankAccount itemOne = myList.get(0);
        System.out.println(itemOne);

        // add a new BankAccount
        myList.add(new BankAccount());
        BankAccount itemTwo = myList.get(1);
        System.out.println(itemTwo);

    }
}