package in.hrms.demo;

import in.hrms.demo.Controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello...");

        EmployeeController employeeController = new EmployeeController();
        employeeController.Welcome();
    }

}
