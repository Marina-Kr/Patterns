package BehavioralPatterns.Chain;

public class MakeDecision extends Check {
    @Override
    public boolean check(CreditRequest creditRequest) {
        if (creditRequest.monthlyPayment < creditRequest.client.salary) {
            return true;
        }
        return false;
    }
}
