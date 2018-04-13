package ua.com.jcoh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.jcoh.entity.Product;

public interface ProductDAO extends JpaRepository<Product,Integer> {
}
