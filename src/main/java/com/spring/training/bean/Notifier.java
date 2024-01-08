package com.spring.training.bean;

import org.springframework.stereotype.Component;

@Component
public interface Notifier {
    void notify(String message);
}
