package pattern.design.factory.method.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pattern.design.factory.method.entities.Product;
import pattern.design.factory.method.factory.DBConfigurationFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDAO {

    @Autowired
    private DBConfigurationFactory factory;

    public ProductDAO() {
    }

    public void saveProduct(Product product) {
        try {
            String query = "Insert into product values (?,?,?)";
            PreparedStatement statement = factory.getConfiguration().getConnection().prepareStatement(query);
            statement.setLong(1, product.getId());
            statement.setString(2, product.getName());
            statement.setDouble(3, product.getPrice());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try {
            String sql = "Select * From product";
            final Connection connection = factory.getConfiguration().getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            final ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product(resultSet.getLong(1), resultSet.getString(2), resultSet.getDouble(3));
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
