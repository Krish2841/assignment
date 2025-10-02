package PatternExercise;
interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification implements Notification {
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}

class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type.equalsIgnoreCase("EMAIL")) return new EmailNotification();
        else if (type.equalsIgnoreCase("SMS")) return new SMSNotification();
        return null;
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("EMAIL");
        n1.send();

        Notification n2 = NotificationFactory.createNotification("SMS");
        n2.send();
    }
}
