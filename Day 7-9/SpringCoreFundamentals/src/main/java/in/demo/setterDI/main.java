package in.demo.setterDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Address address = (Address) applicationContext.getBean(Address.class);
        Employee employee = (Employee) applicationContext.getBean(Employee.class);
        employee.getAddress().displayAddress();

    }
}
