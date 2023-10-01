package com.extension.impl;

import com.extension.repository.UrlsRepository;
import com.extension.store.StoreUrls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UrlsImplement extends StoreUrls implements UrlsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertUrl(String urlName) {
        jdbcTemplate.update(INSERT_URL, urlName);
    }
}
