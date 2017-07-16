package com.project.controllers;


import com.project.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pedro.aguiar
 */
@RestController
@SuppressWarnings("unchecked")
public class AppController {

    @Autowired
    private IService service;


    @RequestMapping(value = "/person")
    public HttpStatus getPerson() {
        final Map<String, Object> result = new HashMap<>();
        result.put("data:", service.getPerson());
        return HttpStatus.OK;
    }
}