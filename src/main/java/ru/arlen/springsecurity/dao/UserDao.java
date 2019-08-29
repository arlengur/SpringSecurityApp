package ru.arlen.springsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arlen.springsecurity.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}