package searchspringbootrestapi.service;

import searchspringbootrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProduct(String query);
    Product createProduct(Product product);
}
