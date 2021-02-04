public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("SAVING", "EUR");
        BankAccount bankAccount2 = new BankAccount("SPENDING", "EUR");
        bankAccount.addMoney(17.59);
        bankAccount.addMoney(15);
        Client client = new Client("Vasile", "129481945");
        client.addBankAccount(bankAccount);
        client.addBankAccount(bankAccount2);
        client.getSavingAccount();
        client.removeAccountByType("SPENDING");
    }
}
