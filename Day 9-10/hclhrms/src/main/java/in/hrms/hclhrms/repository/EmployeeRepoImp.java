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
        for  (Employee employee : employees) {
            if (employee.getEmp_id() == emp_id) {
                employees.remove(employee);
                return "Employee deleted successfully";
            }
        }
        return "Employee not found";
    }

    @Override
    public String updateEmpById(long emp_id, String name){
        Employee emp = employees.stream().filter(e -> e.getEmp_id() == emp_id).findFirst().orElse(null);
        if (emp == null){
            return "Employee not found";
        }
        employees.remove(emp);
        emp.setEmp_name(name);
        employees.add(emp);
        return "Employee updated successfully";

    }
}
