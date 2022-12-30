import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // les Map dans Java
        BankAccount a1 = new BankAccount(30, "holder1", "email1");
        BankAccount a2 = new BankAccount(350, "holder2", "email2");
        BankAccount a3 = new BankAccount(300, "holder3", "email3");

        Map<String, BankAccount> bankAccountMap = new HashMap<>();
        bankAccountMap.put(a1.getEmail(), a1); // put object to map
        bankAccountMap.put(a2.getEmail(), a2);
        bankAccountMap.put(a3.getEmail(), a3);

        BankAccount myBankAccount = bankAccountMap.get("email1"); // get the value of given key or null if key is not in the map
        BankAccount account = bankAccountMap.getOrDefault("email20", new BankAccount(6));
        System.out.println(myBankAccount);
        System.out.println(account);

        // contains key to verify if the key is existing in the map
        boolean exist = bankAccountMap.containsKey("email1");
        System.out.println(exist);

        // replace the value of the given key
        bankAccountMap.replace("email1", new BankAccount(50));
        System.out.println(bankAccountMap);

        // iteration of keys
        for (String key:bankAccountMap.keySet()) {
            System.out.println(key);
        }
        // iteration of values
        for (BankAccount value:bankAccountMap.values()) {
            System.out.println(value);
        }
        // iteration with EntrySet (to iterate keys & values)
        for (var entry:bankAccountMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}