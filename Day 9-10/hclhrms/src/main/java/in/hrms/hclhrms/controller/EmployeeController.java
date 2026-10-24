package in.hrms.hclhrms.controller;

import in.hrms.hclhrms.entity.Employee;
import in.hrms.hclhrms.repository.EmployeeRepo;
import in.hrms.hclhrms.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImp employeeService;

    @GetMapping("/")
    public String index() {
        return
                "Welcome to Hclhrms";
    }

    @PostMapping("/addemp")
    public String addEmp() {
        Employee emp = new Employee(101l, "Shivansh", "Student", "JAVA", "Shiv@gmail.com");
        return employeeService.addEmp(emp);
    }

    @GetMapping("/getemp")
    public List<Employee> getEmp(){
        return employeeService.getEmp();
    }

    @GetMapping("/getempbyid")
    public String getEmpById() {
        Employee emp = employeeService.getEmpById(101l);
        if (emp == null) {
            return "Employee not found";
        }
        return emp.toString();
    }

    @DeleteMapping("/deleteempbyid")
    public String deleteEmpById() {
        return employeeService.deleteEmpById(101l);
    }

    @PatchMapping("/updateempbyid")
    public String updateEmpById() {
        return employeeService.updateEmpById(101l, new Employee(102l, "Vishal", "Student", "JAVA", "Shiv@gmail.com"));
    }

    @PostMapping("/addempbulk")
    public String addEmpBulk() {
        List<Employee> employees  = new ArrayList<>();
        employees.add(new Employee(101l, "Shivansh", "Student", "JAVA", "Shiv@gmail.com"));
        employees.add(new Employee(102l, "Vishal", "Student", "JAVA", "Shiv@gmail.com"));
        employees.add(new Employee(103l, "Satyam", "Student", "JAVA", "Shiv@gmail.com"));
        employees.add(new Employee(104l, "Rohan", "Student", "JAVA", "Shiv@gmail.com"));
        return employeeService.addEmpBulk(employees);
    }
}
