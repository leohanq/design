package pattern.design.factory.method.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pattern.design.factory.method.dao.ProductDAO;
import pattern.design.factory.method.entities.Product;

import java.util.List;

@Controller
@RequestMapping("method")
public class ProductController {

    @Autowired
    private ProductDAO productDAO;

    @GetMapping(value = "/product/all", produces = "application/json")
    public @ResponseBody
    List<Product> getProducts() {
        return productDAO.getAllProducts();
    }

    @PostMapping(value = "/product", consumes = "application/json", produces = "application/json")
    public @ResponseBody void saveProduct(@RequestBody Product product) {
         productDAO.saveProduct(product);
    }

}