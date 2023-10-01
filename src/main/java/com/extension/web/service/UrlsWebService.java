package com.extension.web.service;

import com.extension.controller.UrlsController;
import com.extension.model.UrlsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tiktok/api")
public class UrlsWebService {

    @Autowired
    private UrlsController urlsController;

    @RequestMapping(value = "insert-url", method = RequestMethod.POST)
    public void insertUrl(@RequestBody UrlsFilter filter){
        urlsController.insertUrl(filter.getUrlName());
    }

}
