package in.demo.NotificationService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        Student student2 = context.getBean(Student.class);
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
        //student.Notify();
        context.close();
    }
}
