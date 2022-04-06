package pattern.design.factory.abstractmethod.services.impl.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pattern.design.factory.abstractmethod.entity.Product;
import pattern.design.factory.abstractmethod.services.ProductService;


@Component
public class ProductServiceRestImpl implements ProductService {

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Product[] getProducts() {
        ResponseEntity<Product[]> response = restTemplate.getForEntity("https://6249c6cd852fe6ebf87fdba5.mockapi.io/pattern/employees", Product[].class);
        return response.getBody();
    }
}