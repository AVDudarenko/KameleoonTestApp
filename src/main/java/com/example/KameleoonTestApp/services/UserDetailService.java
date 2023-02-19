package com.example.KameleoonTestApp.services;

import com.example.KameleoonTestApp.models.User;
import com.example.KameleoonTestApp.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailService implements UserDetailsService {

    private final UsersRepository userRepository;

    @Autowired
    public UserDetailService(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> person = userRepository.findByUsername(username);

        if (person.isEmpty()){
            throw new UsernameNotFoundException("User not found");
        }
        return new com.example.KameleoonTestApp.security.UserDetails(person.get());
    }
}
