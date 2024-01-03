package com.example.app.service;

import com.example.app.dto.LogInDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
    private final JwtEncoder jwtEncoder;
    private  final DaoAuthenticationProvider daoAuthenticationProvider;

    @Override
    public String login(LogInDto logInDto) {

        System.out.println("start login");
        System.out.println(logInDto);

        Authentication auth = new UsernamePasswordAuthenticationToken(logInDto.email(), logInDto.password());
        auth = daoAuthenticationProvider.authenticate(auth);
        System.out.println(auth.getPrincipal());
        return "token";
    }
}
