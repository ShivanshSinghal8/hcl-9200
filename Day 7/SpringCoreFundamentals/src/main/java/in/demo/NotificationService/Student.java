package in.demo.NotificationService;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private NotificationService notificationService;
    public Student(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void Notify(){
        notificationService.SendNotification();
    }
}
