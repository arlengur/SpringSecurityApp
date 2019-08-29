package ru.arlen.springsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arlen.springsecurity.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
