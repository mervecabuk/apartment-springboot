package com.example.stajprojem.apartmansitesi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.stajprojem.apartmansitesi.model.Apartment;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
    // Ekstra sorgu metotları ekleyebilirsin

}
