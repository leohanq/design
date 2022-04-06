package pattern.design.factory.abstractmethod.services.impl.ws;

import org.springframework.stereotype.Component;
import pattern.design.factory.abstractmethod.entity.Product;
import pattern.design.factory.abstractmethod.services.ProductService;


@Component
public class ProductServiceWSImpl implements ProductService {
    @Override
    public Product[] getProducts() {
        return new Product[]{new Product("1", "Coke", 1000)};
    }
}