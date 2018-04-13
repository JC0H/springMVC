package ua.com.jcoh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.jcoh.entity.User;

public interface UserDAO extends JpaRepository<User,Integer> {
}
