package in.demo.NotificationService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private NotificationService notificationService;
    public Student(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void Notify(){
        notificationService.SendNotification();
    }

    @PostConstruct
    public void init(){
        System.out.println("Student object created");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Student object destroyed");
    }
}
