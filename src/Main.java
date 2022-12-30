public class Main {
    public static void main(String[] args) {
        GenericList<BankAccount> myList = new GenericList();

        myList.add(new BankAccount((50)));
        BankAccount itemOne = myList.get(0);
        System.out.println(itemOne);

        // add a new BankAccount
        myList.add(new BankAccount(60));
        BankAccount itemTwo = myList.get(1);
        System.out.println(itemTwo);

        if(itemOne.compareTo(itemTwo)<0){
            System.out.println("BankAccount one < BankAccount two.");
        }else if (itemOne.compareTo(itemTwo)>0){
            System.out.println("BankAccount one > BankAccount two.");
        }else{
            System.out.println("BankAccount one == BankAccount two.");
        }

    }
}