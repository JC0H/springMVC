package ua.com.jcoh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.jcoh.dao.ProductDAO;
import ua.com.jcoh.entity.Product;
import ua.com.jcoh.service.ProductService;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductDAO productDAO;

    @Override
    public void save(Product user) {
        productDAO.save(user);
    }

    @Override
    public void save(String name) {
        Product product = new Product(name);
        productDAO.save(product);
    }

    @Override
    public Product findOne(int id) {
        return productDAO.findOne(id);
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }
}
