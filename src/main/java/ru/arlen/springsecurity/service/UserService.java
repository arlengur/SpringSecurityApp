package ru.arlen.springsecurity.service;

import ru.arlen.springsecurity.model.User;

/**
 * Service class for {@link User}
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}