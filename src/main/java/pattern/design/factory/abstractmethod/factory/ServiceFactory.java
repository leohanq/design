package pattern.design.factory.abstractmethod.factory;

import pattern.design.factory.abstractmethod.services.EmployeeService;
import pattern.design.factory.abstractmethod.services.ProductService;

public interface ServiceFactory {

    EmployeeService getEmployeeService();

    ProductService getProductService();
}