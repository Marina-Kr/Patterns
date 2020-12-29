package CreationalPatterns;

//Использован паттерн "Фабричный метод"
public class Program {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = createCreditCardFactory(CreditCardTypes.Classic);
        assert creditCardFactory != null;
        CreditCard newCreditCard = creditCardFactory.createCreditCard();
        newCreditCard.getBalance();

        CreditCardFactory anotherCreditCardFactory = createCreditCardFactory(CreditCardTypes.Premium);
        assert anotherCreditCardFactory != null;
        CreditCard secondCreditCard = anotherCreditCardFactory.createCreditCard();
        secondCreditCard.getBalance();
    }

    static CreditCardFactory createCreditCardFactory(CreditCardTypes type) {
        switch (type) {
            case Gold:
                return new GoldCreditCardFactory();
            case Classic:
                return new ClassicCreditCardFactory();
            case Premium:
                return new PremiumCreditCardFactory();
            default:
                return null;
        }

    }
}

