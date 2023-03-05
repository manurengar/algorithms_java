package chp1;

public class Main {
    // https://stackoverflow.com/questions/64160463/error-invalid-source-release-14-with-enable-preview
    public static void main(String... args){
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman","California Savings", "5341 2314 9812 0032", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Savings", "3124 1234 5065 2332", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Savings", "3155 1934 4065 4562",
                3500, 300);

        for(int i = 1; i<=16; i++){
            wallet[0].makePayment(3*i);
            wallet[1].makePayment(2*i);
            wallet[2].makePayment(i);
        }

        for(CreditCard card: wallet) {
            CreditCard.printSummary(card);
            while(card.getBalance() > 200) {
                card.charge(200);
                System.out.println("New account balance: " + card.getBalance());
            }
        }
    }
}
