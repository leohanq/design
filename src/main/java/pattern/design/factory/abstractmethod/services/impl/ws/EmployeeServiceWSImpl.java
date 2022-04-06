package pattern.design.factory.abstractmethod.services.impl.ws;

import org.springframework.stereotype.Component;
import pattern.design.factory.abstractmethod.entity.Employee;
import pattern.design.factory.abstractmethod.services.EmployeeService;

@Component
public class EmployeeServiceWSImpl implements EmployeeService {
    @Override
    public Employee[] getEmployee() {
        return new Employee[]{new Employee("1", "Leo", 0, false)};
    }
}