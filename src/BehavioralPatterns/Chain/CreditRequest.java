package BehavioralPatterns.Chain;

public class CreditRequest {
    Client client;
    int monthlyPayment;
    int amount;
    int percent;

    public CreditRequest(Client client, int monthlyPayment, int amount, int percent) {
        this.client = client;
        this.monthlyPayment = monthlyPayment;
        this.amount = amount;
        this.percent = percent;
    }
}
