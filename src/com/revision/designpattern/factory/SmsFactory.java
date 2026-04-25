package com.revision.designpattern.factory;

public class SmsFactory extends NotificationFactory{
    @Override
    Notification createNotification() {
        return new SmsNotification();
    }
}
