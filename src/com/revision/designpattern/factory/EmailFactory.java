package com.revision.designpattern.factory;

public class EmailFactory extends NotificationFactory{
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}
