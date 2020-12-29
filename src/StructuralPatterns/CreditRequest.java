package StructuralPatterns;



public class CreditRequest {
    String client;
    int monthlyPayment;
    int amount;
    int percent;

    public CreditRequest(String client, int monthlyPayment, int amount, int percent) {
        this.client = client;
        this.monthlyPayment = monthlyPayment;
        this.amount = amount;
        this.percent = percent;
    }
}
