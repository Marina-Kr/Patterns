package BehavioralPatterns.Command;

public class Exectutor {
    final Sender sender = new Sender();
    Command sendLink = new SendLinkCommand(sender);
    Command sendEmail = new SendEmailCommand(sender);
    Command sendNotification = new SendNotificationCommand(sender);

    public void execute(Mode mode) {
        switch (mode) {
            case First: {
                sendLink.execute();
                break;
            }
            case Second: {
                sendEmail.execute();
                sendNotification.execute();
                break;
            }
            case Third: {
                sendLink.execute();
                sendEmail.execute();
                sendNotification.execute();
                break;
            }
        }
    }
}
