import java.util.ArrayList;
import java.util.Collections;

public class Client {

    private ArrayList<BankAccount> bankAccountArrayList;
    private String name;
    private String cnp;


    public Client(String name, String cnp) {
        bankAccountArrayList = new ArrayList<>();
        this.name = name;
        this.cnp = cnp;
    }

    public void addBankAccount(BankAccount bankAccount) {
        for (BankAccount everyAccount : bankAccountArrayList) {
            if (everyAccount.getType().equalsIgnoreCase(bankAccount.getType())) {
                System.out.println("There already is an account of that type");
                return;
            }
        }
        bankAccountArrayList.add(bankAccount);
    }

    public BankAccount getSavingAccount() {
        for (BankAccount everyAccount : bankAccountArrayList) {
            if (everyAccount.getType().equalsIgnoreCase("SAVING")) {
                return everyAccount;
            }
        }
        System.out.println("There is no SAVING account registered to the client");
        return null;
    }

    public void removeAccountByType(String Type) {
        int index;
        ArrayList<Integer> intIndex = new ArrayList<>();
        for (BankAccount everyAccount : bankAccountArrayList) {
            if (everyAccount.getType().equalsIgnoreCase(Type)) {
                index = bankAccountArrayList.indexOf(everyAccount);
                intIndex.add(index);
                System.out.println("Bank account successfully removed");
            }
        }
        if(!intIndex.isEmpty()){
            for (Integer element : intIndex) {
                bankAccountArrayList.remove(element);
            }

        }


        System.out.println("No bank account of that type is registered to client");
    }

    @Override
    public String toString() {
        return "Client{" +
                "Conturile clientului sunt: " + bankAccountArrayList +
                ", Numele clientului = '" + name + '\'' +
                ", CNP ='" + cnp + '\'' +
                '}';
    }
}



