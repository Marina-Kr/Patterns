package BehavioralPatterns.Chain;

//Использован паттерн "Цепочка ответственности"
public class Program {

    public static boolean confirm(CreditRequest creditRequest, Check check) {
        if (check.check(creditRequest)) {
            System.out.println("Заявка одобрена");
            return true;
        } else System.out.println("Заявка отклонена");
        return false;
    }

    public static void main(String[] args) {
        Client client = new Client("Иванов И.И", "good", 10000);
        CreditRequest clientReguest = new CreditRequest(client, 5000, 100000,  16);
        Check requestCheck = new CreditRequestCheck();
        requestCheck.linkWith(new CreditRequestCheck()).linkWith(new MakeDecision());

        boolean success;
        do {
            success = confirm(clientReguest, requestCheck);
        } while (success = false);

    }
}
