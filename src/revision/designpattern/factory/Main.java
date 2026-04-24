package revision.designpattern.factory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new EmailFactory();
        notificationFactory.sendNotification();

        notificationFactory = new SmsFactory();
        notificationFactory.sendNotification();
    }
}
