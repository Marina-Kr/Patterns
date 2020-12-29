package BehavioralPatterns.Command;

public class Sender {
    public void sendLink() {
        System.out.println("Отправлено СМС с ссылкой");
    }

    public void sendEmail() {
        System.out.println("Отправлено электронное письмо");
    }

    public void sendNotification(){
        System.out.println("Отправлено СМС с оповещением");
    }


}
