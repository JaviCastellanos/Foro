package com.ejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejemplo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}