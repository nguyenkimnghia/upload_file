package service.impl;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ProductRepository;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAllHaveBusiness() {
            return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public void saveService(Product product) {
        productRepository.save(product);
    }
}
