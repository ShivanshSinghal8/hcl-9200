package in.demo.NotificationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmsService implements NotificationService {
    @Override
    public void SendNotification() {
        System.out.println("SMS notification sent...");
    }
}
