package in.demo.NotificationService;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements NotificationService {
    @Override
    public void SendNotification() {
        System.out.println("Email notification sent...");
    }
}
