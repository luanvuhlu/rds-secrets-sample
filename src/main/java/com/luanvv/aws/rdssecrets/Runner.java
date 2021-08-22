package com.luanvv.aws.rdssecrets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Runner implements CommandLineRunner {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public Runner(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) {
        jdbcTemplate.update("INSERT INTO user (firstname, lastname, created_time) VALUES (?, ?, ?)", "Luan", "Vu", LocalDateTime.now());
    }
}
