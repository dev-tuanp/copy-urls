package com.extension.api;

import com.extension.repository.UrlsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlsApi {

    @Autowired
    private UrlsRepository urlsRepository;

    public void insertUrl(String urlName){
        urlsRepository.insertUrl(urlName);
    }
}
