package CreationalPatterns;

public class ClassicCreditCard implements CreditCard {
    @Override
    public void getBalance() {
        System.out.println("На классической карте в данный момент 0 рублей");
    }
}
