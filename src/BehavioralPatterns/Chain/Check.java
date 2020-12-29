package BehavioralPatterns.Chain;


public abstract class Check {
    private Check next;


    public Check linkWith(Check next) {
        this.next = next;
        return next;
    }

    public  boolean check(CreditRequest creditRequest) {
        return false;
    }

    protected boolean checkNext(CreditRequest creditRequest) {
        if (next == null) {
            return true;
        }
        return next.check(creditRequest);
    }
}