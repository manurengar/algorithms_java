package chp1;

public class CreditCard {
    // Instance variables
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String cus, String bank, String acnt, int lim, double initBal){
        this.customer = cus;
        this.bank = bank;
        this.account = acnt;
        this.limit = lim;
        this.balance = initBal;
    }
    public CreditCard(String cus, String bank, String acnt, int lim) {
        this(cus,bank,acnt,lim,0);
    }
    // Getters methods
    public String getCustomer() {
        return this.customer;
    }
    public String getBank() {
        return this.bank;
    }
    public String getAccount() {
        return this.account;
    }
    public int getLimit() {
        return this.limit;
    }
    public double getBalance(){
        return  this.balance;
    }
    // Update methods
    public boolean makePayment(int amount) {
        if(balance + amount <= limit){
            balance += amount;
            return true;
        }
        return false;
    }
    public boolean charge(int price) {
        if(balance - price >= 0) {
            balance -= price;
            return true;
        }
        return false;
    }
    // Utility method for printing card information
    public static void printSummary(CreditCard card) {
        System.out.printf("""
                Customer:%20S
                Bank:%20S
                Account:%20S
                Balance:%+20.2f
                Limit:%+20d
                """,card.customer, card.bank, card.account, card.balance, card.limit);
    }
}
