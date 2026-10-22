package in.hrms.demo.Controller;

import in.hrms.demo.model.DemoEmployee;
import in.hrms.demo.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private DemoEmployee demoEmployee;

    @GetMapping("/")
    public String Welcome() {
        return "Hello World!";
    }

    @GetMapping("/add")
    public int add() {
        return demoEmployee.add(1, 5);
    }

    @GetMapping("/sqrt")
    public double sqrt() {
        return demoEmployee.squareRoot(64);
    }

    @GetMapping("/gtn")
    public double gtn() {
        return demoEmployee.gtn(7,56);
    }
}
