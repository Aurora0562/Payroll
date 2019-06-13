package payroll.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import payroll.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
