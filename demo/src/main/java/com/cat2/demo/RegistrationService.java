package com.cat2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean registerUser(String name, String username, String password, String email, String phone, String address) {
        String sql = "INSERT INTO users (name, username, password, email, phone, address) VALUES (?, ?, ?, ?, ?, ?)";

        int rowsAffected = jdbcTemplate.update(sql, name, username, password, email, phone, address);

        return rowsAffected > 0;
    }
}

