package ua.com.jcoh.service;

import ua.com.jcoh.entity.Product;
import ua.com.jcoh.entity.User;

import java.util.List;

public interface ProductService {
    void save(Product user);
    void save(String name);
    Product findOne(int id);
    List<Product> findAll();

}
