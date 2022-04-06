package pattern.design.factory.abstractmethod.services.impl.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pattern.design.factory.abstractmethod.entity.Employee;
import pattern.design.factory.abstractmethod.services.EmployeeService;

@Component
public class EmployeeServiceRestImpl implements EmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Employee[] getEmployee() {
        ResponseEntity<Employee[]> response = restTemplate.getForEntity("https://6249c6cd852fe6ebf87fdba5.mockapi.io/pattern/employees", Employee[].class);
        return response.getBody();
    }
}