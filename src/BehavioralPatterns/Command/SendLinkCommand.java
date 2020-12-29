package BehavioralPatterns.Command;

public class SendLinkCommand implements Command {
    private final Sender sender;

    public SendLinkCommand(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void execute() {
        sender.sendLink();
    }

}
