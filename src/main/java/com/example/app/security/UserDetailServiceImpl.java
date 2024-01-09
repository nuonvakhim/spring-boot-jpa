package com.example.app.security;

import com.example.app.entity.Authority;
import com.example.app.entity.Role;
import com.example.app.entity.User;
import com.example.app.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user= userRepository.findByEmail(email).orElseThrow(
                ()-> new UsernameNotFoundException("User with this email not found"));




        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

            for (Role role: user.getRoles()){

                authorities.add(new SimpleGrantedAuthority(role.getName()));
                for(Authority authority : role.getAuthorities()){
                    authorities.add(new SimpleGrantedAuthority(authority.getName()));
                }
            }

        org.springframework.security.core.userdetails.User securityUser =
                new org.springframework.security.core.userdetails.User(
                        user.getEmail(),
                        user.getPassword(),
                        authorities);
        return securityUser;
    }
}
