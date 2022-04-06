package pattern.design.factory.abstractmethod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pattern.design.factory.abstractmethod.entity.Product;
import pattern.design.factory.abstractmethod.factory.ServiceFactory;
import pattern.design.factory.abstractmethod.factory.ServiceFactoryImpl;
import pattern.design.factory.abstractmethod.services.ProductService;

import java.util.List;

@Controller
@RequestMapping("abstract/products")
public class ProductsController {

    @Autowired
    private ServiceFactoryImpl serviceStackAbstractFactory;

    @GetMapping(value = "/all", produces = "application/json")
    @ResponseBody
    public Product[] getEmployees() {
        ServiceFactory stackAbstractFactory  =  serviceStackAbstractFactory.createServiceFactory();
        final ProductService employeeService = stackAbstractFactory.getProductService();
        return employeeService.getProducts();
    }
}