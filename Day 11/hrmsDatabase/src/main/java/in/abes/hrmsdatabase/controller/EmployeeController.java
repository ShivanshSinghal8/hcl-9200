package in.abes.hrmsdatabase.controller;

import in.abes.hrmsdatabase.model.Employee;
import in.abes.hrmsdatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String index() {
        return "HRMS Application started";
    }

    @GetMapping("/addemp")
    public String addEmployee() {
        Employee employee = new Employee(101, "Shivansh", "Student", "Java", "Shiv@gmail.com");
        return employeeService.createNewEmployee(employee);
    }

    @GetMapping("/deleteempbyid")
    public String deleteEmployeeById() {
        return employeeService.DeleteEmpById(101);
    }
}
