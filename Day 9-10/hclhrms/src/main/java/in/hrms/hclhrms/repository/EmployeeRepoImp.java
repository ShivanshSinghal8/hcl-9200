package in.hrms.hclhrms.repository;

import in.hrms.hclhrms.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeRepoImp implements EmployeeRepo {
    List<Employee> employees = new ArrayList<>();

    @Override
    public String addEmpBulk(List<Employee> employees) {
        this.employees.addAll(employees);
        return "Employees added successfully!";
    }

    @Override
    public String addEmp(Employee employee) {
        employees.add(employee);
        return "Employee added successfully";
    }

    @Override
    public List<Employee> getEmp() {
        return employees;
    }

    @Override
    public Employee getEmpById(long emp_id) {
        return employees.stream().filter(e -> e.getEmp_id() == emp_id).findFirst().orElse(null);
    }

    @Override
    public String deleteEmpById(long emp_id) {
        boolean found= employees.removeIf(e -> e.getEmp_id() == emp_id);
        if (found) {
            return "Employee deleted successfully!";
        }
        return "Employee not found!";
    }

    @Override
    public String updateEmpById(long emp_id, Employee updatedEmp){
        Employee existingEmp = getEmpById(emp_id);
        if (existingEmp == null) {
            return "Employee not found!";
        }
        existingEmp.setEmp_name(updatedEmp.getEmp_name());
        existingEmp.setEmp_id(updatedEmp.getEmp_id());
        existingEmp.setDesignation(updatedEmp.getDesignation());
        existingEmp.setEmail(updatedEmp.getEmail());
        existingEmp.setProgStack(updatedEmp.getProgStack());
        return "Employee updated successfully!";
    }
}
