package com.login.mock.userservice;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LoginUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String user ) throws UsernameNotFoundException {
        String password = new BCryptPasswordEncoder().encode("foo");
        return new User("foo", password,new ArrayList<>());
    }
}
