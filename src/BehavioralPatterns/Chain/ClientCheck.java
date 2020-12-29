package BehavioralPatterns.Chain;

public class ClientCheck extends Check {
    @Override
    public boolean check(CreditRequest creditRequest) {
        if (creditRequest.client.creditHistory.equals("bad") || creditRequest.client.salary == 0) {
            return false;
        }
        return checkNext(creditRequest);
    }
}
