package CreationalPatterns;

public class GoldCreditCardFactory implements CreditCardFactory {
    @Override
    public CreditCard createCreditCard() {
        System.out.println("Золотая карта выпущена");
        return new GoldCreditCard();
    }
}
