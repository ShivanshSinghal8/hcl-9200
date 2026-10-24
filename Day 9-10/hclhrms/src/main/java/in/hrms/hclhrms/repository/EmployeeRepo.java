package in.hrms.hclhrms.repository;

import in.hrms.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo {
    String addEmpBulk(List<Employee> employees);
    String addEmp(Employee employee);
    List<Employee> getEmp();
    Employee getEmpById(long emp_id);
    String deleteEmpById(long emp_id);
    String updateEmpById(long emp_id, Employee updatedEmp);

}
