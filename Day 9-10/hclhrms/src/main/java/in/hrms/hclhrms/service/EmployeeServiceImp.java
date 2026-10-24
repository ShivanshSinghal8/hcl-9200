package in.hrms.hclhrms.service;

import in.hrms.hclhrms.entity.Employee;
import in.hrms.hclhrms.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp {
    @Autowired
    private EmployeeRepo employeeRepo;

    public String addEmp(Employee employee) {
        return employeeRepo.addEmp(employee);
    }

    public List<Employee> getEmp() {
        return employeeRepo.getEmp();
    }

    public Employee getEmpById(long emp_id) {
        return employeeRepo.getEmpById(emp_id);
    }

    public String deleteEmpById(long emp_id) {
        return employeeRepo.deleteEmpById(emp_id);
    }

    public String updateEmpById(long emp_id, Employee updatedEmp) {
        return employeeRepo.updateEmpById(emp_id, updatedEmp);
    }

    public String addEmpBulk(List<Employee> employees) {
        return employeeRepo.addEmpBulk(employees);
    }
}
