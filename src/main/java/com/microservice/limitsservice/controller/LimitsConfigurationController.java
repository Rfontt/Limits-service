package com.microservice.limitsservice.controller;

import com.microservice.limitsservice.bean.LimitConfiguration;
import com.microservice.limitsservice.configs.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;

    @GetMapping
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(
                configuration.getMaximum(),
                configuration.getMinimum()
        );
    }
}
