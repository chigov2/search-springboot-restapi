package searchspringbootrestapi.service.impl;

import org.springframework.stereotype.Service;
import searchspringbootrestapi.entity.Product;
import searchspringbootrestapi.repository.ProductRepository;
import searchspringbootrestapi.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProduct(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
