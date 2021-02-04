public class BankAccount {

    /**
     * Currency can be USD or EUR.
     */
    private String currency;

    /**
     * Type of account can be SAVING or SPENDING.
     */
    private String type;

    /**
     * The amount of money in the account.
     */
    private double balance;

    /**
     * BankAccount constructor
     * initialize balance with 0
     *
     * @param type     of account
     * @param currency of account
     */
    public BankAccount(String type, String currency) {
        this.balance = 0;
        this.currency = currency;
        this.type = type;
    }

    /**
     * Money gets added to the account if type SAVING or SPENDING*
     * and spending input is at least 10% greater than current balance.
     * return stops function.
     * @param moneyAdded given by the user to be added.
     */
    public void addMoney(double moneyAdded){
        if(type.equalsIgnoreCase("SPENDING")){
            if(moneyAdded <= (balance/10)){
                System.out.println("The amount of money added needs to be more than 10% of current balance");
                return;
            }
        }
        balance = balance + moneyAdded;
    }

    public void withdrawMoney(double withdrawMoney){
        if(type.equalsIgnoreCase("SAVING")){
            if((balance-withdrawMoney) < 0){
                System.out.println("Operation cannot be completed. Balance will be less than 0");
            }
        }
        balance = balance - withdrawMoney;
    }

    public double convertMoneyToCurrency(double amountOfMoney, String currency){
        if(this.currency.equalsIgnoreCase(currency)){
            System.out.println("Operation can not be completed. Cannot convert " + currency + " to " + currency);
            return 0;
        }

        if(amountOfMoney<=balance){
            balance = balance - amountOfMoney;
            if(currency.equalsIgnoreCase("EUR")){
                amountOfMoney = amountOfMoney*(1.2);
            }
            if(currency.equalsIgnoreCase("USD")){
                amountOfMoney = amountOfMoney*(0.83);
            }
        }else {
            System.out.println("Balance is lower than amount of money to convert");
        }
        return amountOfMoney;
    }

    public String getCurrency() {
        return currency;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "currency='" + currency + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
