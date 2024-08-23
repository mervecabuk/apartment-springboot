package com.example.stajprojem.apartmansitesi.controller;

import com.example.stajprojem.apartmansitesi.model.Apartment;
import com.example.stajprojem.apartmansitesi.repository.UserRepository;
import com.example.stajprojem.apartmansitesi.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private ApartmentService apartmentService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/apartment/{id}")
    public ResponseEntity<?> getApartmentById(@PathVariable Long id) {
        Optional<Apartment> apartment = Optional.ofNullable(apartmentService.getApartmentById(id));

        if (apartment.isPresent()) {
            return ResponseEntity.ok(apartment.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Apartment not found");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login() {
        return ResponseEntity.ok().body("süperüsüper");


    }
}

