package in.hrms.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo {
    public double squareroot(double d);

    public String empData();

    int add(int a, int b);

    int gtn(int a, int b);
}
