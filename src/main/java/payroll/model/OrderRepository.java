package payroll.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import payroll.model.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
