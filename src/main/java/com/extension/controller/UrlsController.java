package com.extension.controller;

import com.extension.api.UrlsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlsController {

    @Autowired
    private UrlsApi urlsApi;

    public void insertUrl(String urlName){
        urlsApi.insertUrl(urlName);
    }
}
