package com.example.stajprojem.apartmansitesi.model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@Table(name = "app_users") // Tablo adı burada belirlenir
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID otomatik olarak artar
    private long id;

    @Column(nullable = false, unique = true) // Email zorunlu ve benzersiz olmalı
    private String email;

    @Column(nullable = false) // Şifre zorunlu olmalı
    private String password;

    // Getter ve Setter metodları
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
