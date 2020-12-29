package StructuralPatterns;

public class HistoryService {
    public CreditRequest createRequest(String client, int monthlyPayment, int amount, int percent) {
        System.out.println("Создана новая заявка на кредит");
        return new CreditRequest(client, monthlyPayment, amount, percent);
    }

    public void updateRequest(String client, int monthlyPayment, int amount, int percent, CreditRequest request) {
        request.client = client;
        request.monthlyPayment = monthlyPayment;
        request.amount = amount;
        request.percent = percent;
        System.out.println("Заявка на кредит обновлена");
    }

    public CreditRequest getRequest(CreditRequest request) {
        System.out.println("Получена заявка на кредит");
        return request;
    }
}
