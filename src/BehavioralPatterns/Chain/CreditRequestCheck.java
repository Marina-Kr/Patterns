package BehavioralPatterns.Chain;


public class CreditRequestCheck extends Check {
    @Override
    public  boolean check(CreditRequest creditRequest) {
        if (creditRequest.amount == 0 || creditRequest.client == null
                || creditRequest.monthlyPayment == 0 || creditRequest.percent == 0) {
            return false;
        }
        return checkNext(creditRequest);
    }
}
