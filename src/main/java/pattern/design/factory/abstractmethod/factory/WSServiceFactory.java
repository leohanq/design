package pattern.design.factory.abstractmethod.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pattern.design.factory.abstractmethod.services.EmployeeService;
import pattern.design.factory.abstractmethod.services.ProductService;
import pattern.design.factory.abstractmethod.services.impl.ws.EmployeeServiceWSImpl;
import pattern.design.factory.abstractmethod.services.impl.ws.ProductServiceWSImpl;

@Component
public class WSServiceFactory implements ServiceFactory {

    @Autowired
    private EmployeeServiceWSImpl employeeServiceWS;

    @Autowired
    private ProductServiceWSImpl productServiceWS;

    @Override
    public EmployeeService getEmployeeService() {
        return employeeServiceWS;
    }

    @Override
    public ProductService getProductService() {
        return productServiceWS;
    }
}