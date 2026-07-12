package com.example.paymentservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private static final Logger logger = LoggerFactory.getLogger(PaymentService.class);

    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallbackPayment")
    public String processPayment() {

        logger.info("Calling Third Party Payment API...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        throw new RuntimeException("Third Party Payment API Failed");
    }

    public String fallbackPayment(Exception ex) {

        logger.info("Fallback executed because: {}", ex.getMessage());

        return "Payment Service is temporarily unavailable. Please try again later.";
    }
}