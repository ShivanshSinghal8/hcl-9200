package in.demo.setterDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address Address(){
        Address address = new Address();
        address.setAddress("Crossing Republic");
        return address;
    }

    @Bean
    public Employee Employee(){
        Employee employee = new Employee();
        employee.setAddress(Address());
        return employee;
    }
}
