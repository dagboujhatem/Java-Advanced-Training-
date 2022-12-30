import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // The Comparator interface
        List<BankAccount> list = new ArrayList<>();
        list.add(new BankAccount(45,"holder1", "email1"));
        list.add(new BankAccount(455, "holder2", "email2"));
        list.add(new BankAccount(35, "holder3", "email13"));
        System.out.println(list);
        Collections.sort(list, new BalanceComparator()); // sort with balance
        System.out.println(list);
        Collections.sort(list, new EmailComparator()); // sort with email
        System.out.println(list);

    }
}