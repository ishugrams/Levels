class BankAcct {
    private double principal;
    private double rate;

    public BankAcct(double principal, double rate) {
        this.principal = principal;
        this.rate = rate;
    }

    public void calculateInterest() {
        Interest interest = new Interest();
        interest.displayInterest();
    }

    class Interest {
        void displayInterest() {
            double interestAmount = (principal * rate * 1) / 100; 
            System.out.println("Principal: " + principal);
            System.out.println("Rate of Interest: " + rate + "%");
            System.out.println("Interest Amount: " + interestAmount);
        }
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        BankAcct bankAccount = new BankAcct(10000, 5.5);         
        bankAccount.calculateInterest();
    }
}
