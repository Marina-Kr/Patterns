package CreationalPatterns;

public class ClassicCreditCardFactory implements CreditCardFactory {

    @Override
    public CreditCard createCreditCard() {
        System.out.println("Классическая карта выпущена");
        return new ClassicCreditCard();
    }
}
