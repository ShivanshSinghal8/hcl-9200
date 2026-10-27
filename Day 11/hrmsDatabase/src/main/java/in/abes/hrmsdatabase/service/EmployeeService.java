package in.abes.hrmsdatabase.service;

import in.abes.hrmsdatabase.model.Employee;
import in.abes.hrmsdatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String createNewEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee created successfully!";
    }

    public String DeleteEmpById(long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return "Employee deleted successfully!";
        }
        return "Employee not found!";
    }

//    public String updateEmpById(long id, Employee employee) {
//        if (employeeRepository.existsById(id)) {
//            employeeRepository.findById(id);
//            employeeRepository.save(employee);
//            return "Employee updated successfully!";
//        }
//        return "Employee not found!";
//    }

}
