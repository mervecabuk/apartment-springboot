// src/main/java/com/example/stajprojem/apartmansitesi/service/UserService.java
package com.example.stajprojem.apartmansitesi.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean authenticate(String username, String password) {
        // Burada kullanıcı doğrulama işlemini yapacağız.
        // Örneğin, kullanıcı adı ve şifreyi veritabanında kontrol edebiliriz.
        // Şimdilik basit bir kontrol ekleyelim.

        String user = "user";
        return "testuser".equals(username) && "testpassword".equals(password);
    }
}
