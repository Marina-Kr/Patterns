package CreationalPatterns;

public class PremiumCreditCard implements CreditCard {
    @Override
    public void getBalance() {
        System.out.println("На премиальная карте в данный момент 50000 рублей");
    }
}
