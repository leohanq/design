package pattern.design.factory.abstractmethod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pattern.design.factory.abstractmethod.entity.Employee;
import pattern.design.factory.abstractmethod.factory.ServiceFactory;
import pattern.design.factory.abstractmethod.factory.ServiceFactoryImpl;
import pattern.design.factory.abstractmethod.services.EmployeeService;

@Controller
@RequestMapping("abstract/employees")
public class EmployeeController {

    @Autowired
    private ServiceFactoryImpl serviceFactoryImpl;

    @GetMapping(value = "/all", produces = "application/json")
    public @ResponseBody
    Employee[] getEmployees() {
        ServiceFactory serviceFactory = serviceFactoryImpl.createServiceFactory();
        final EmployeeService employeeService = serviceFactory.getEmployeeService();
        return employeeService.getEmployee();
    }
}