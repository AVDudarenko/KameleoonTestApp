package com.example.KameleoonTestApp.util;

import com.example.KameleoonTestApp.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    private final UserDetailService userDetailService;

    @Autowired
    public UserValidator(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Users.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Users user = (Users) target;
        try {
            userDetailService.loadUserByUsername(user.getName());
        } catch (UsernameNotFoundException e) {
            return;
        }

        errors.rejectValue("username", "", "User exist");
    }
}
