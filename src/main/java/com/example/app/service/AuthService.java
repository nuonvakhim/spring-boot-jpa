package com.example.app.service;

import com.example.app.dto.LogInDto;

public interface AuthService {
    String login(LogInDto logInDto);
}
