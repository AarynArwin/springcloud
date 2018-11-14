package com.geekerit.feign.service.impl;

import com.geekerit.feign.service.ApiService;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务器发生故障";
    }
}
