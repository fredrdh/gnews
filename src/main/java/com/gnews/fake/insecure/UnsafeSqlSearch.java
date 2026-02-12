package com.gnews.fake.insecure;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class UnsafeSqlSearch {
    private final JdbcTemplate jdbcTemplate;

    public UnsafeSqlSearch(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> findByTitle(String userInput) {
        String query = "SELECT * FROM news WHERE title = '" + userInput + "'";
        return jdbcTemplate.queryForList(query);
    }
}
