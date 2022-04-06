package pattern.design.factory.abstractmethod.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pattern.design.factory.abstractmethod.services.EmployeeService;
import pattern.design.factory.abstractmethod.services.ProductService;
import pattern.design.factory.abstractmethod.services.impl.rest.EmployeeServiceRestImpl;
import pattern.design.factory.abstractmethod.services.impl.rest.ProductServiceRestImpl;

@Component
public class RestServiceFactory implements ServiceFactory {

    @Autowired
    private EmployeeServiceRestImpl employeeServiceRest;

    @Autowired
    private ProductServiceRestImpl productServiceRest;

    @Override
    public EmployeeService getEmployeeService() {
        return employeeServiceRest;
    }

    @Override
    public ProductService getProductService() {
        return productServiceRest;
    }
}