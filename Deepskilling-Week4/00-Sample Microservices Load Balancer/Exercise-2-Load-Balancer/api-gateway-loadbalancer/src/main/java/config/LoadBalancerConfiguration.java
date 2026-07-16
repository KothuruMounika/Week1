package com.cognizant.loadbalancer.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalancerConfiguration {

    public LoadBalancerConfiguration() {
        System.out.println("Load Balancer Configuration Loaded");
    }

}