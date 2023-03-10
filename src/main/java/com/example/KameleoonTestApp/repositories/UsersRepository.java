package com.example.KameleoonTestApp.repositories;

import com.example.KameleoonTestApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String userName);
}
