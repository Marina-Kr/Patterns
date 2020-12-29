package CreationalPatterns;

public class PremiumCreditCardFactory implements CreditCardFactory{
    @Override
    public CreditCard createCreditCard() {
        System.out.println("Премиальная карта выпущена");
        return new PremiumCreditCard();
    }
}
