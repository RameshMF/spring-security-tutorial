package net.javaguides.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springsecurity.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
