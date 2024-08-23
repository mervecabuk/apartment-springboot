package com.example.stajprojem.apartmansitesi.repository;

import com.example.stajprojem.apartmansitesi.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
}
