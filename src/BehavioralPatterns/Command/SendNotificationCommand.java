package BehavioralPatterns.Command;

public class SendNotificationCommand implements Command {
    private final Sender sender;

    public SendNotificationCommand(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void execute() {
        sender.sendNotification();
    }
}
