package com.revision.designpattern.factory;

public abstract class NotificationFactory {

    abstract Notification createNotification();

    public void sendNotification(){
        Notification notification = createNotification();
        notification.send();
    }
}
