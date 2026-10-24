package in.hrms.hclhrms;

import in.hrms.hclhrms.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HclhrmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HclhrmsApplication.class, args);
        System.out.println("HEllO...");
    }
}
