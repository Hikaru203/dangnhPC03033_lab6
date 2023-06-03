package com.example.demo.service;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class SessionService {

    private final HttpServletRequest request;

    public SessionService(HttpServletRequest request) {
        this.request = request;
    }

    public void set(String key, Object value) {
        HttpSession session = request.getSession();
        session.setAttribute(key, value);
    }

    public Object get(String key, Object defaultValue) {
        HttpSession session = request.getSession();
        Object value = session.getAttribute(key);
        return value != null ? value : defaultValue;
    }
}

