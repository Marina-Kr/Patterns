package CreationalPatterns;

public class GoldCreditCard implements CreditCard {
    @Override
    public void getBalance() {
        System.out.println("На золотой карте в данный момент 10000 рублей");
    }
}
