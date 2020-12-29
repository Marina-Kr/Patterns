package BehavioralPatterns.Command;

public class SendEmailCommand implements Command{
    private final Sender sender;

    public SendEmailCommand(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void execute() {
     sender.sendEmail();
    }
}
