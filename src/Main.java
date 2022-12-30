import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        List myList = new List();
        myList.add(5);
        int intItem = (int) myList.get(0);
        System.out.println(intItem);

        // add a string
        myList.add("hello");
        String stringItem = (String) myList.get(1);
        System.out.println(stringItem);

        // add a bank account
        myList.add(new BankAccount());
        BankAccount bankAccountItem = (BankAccount) myList.get(2);
        System.out.println(bankAccountItem);
    }
}