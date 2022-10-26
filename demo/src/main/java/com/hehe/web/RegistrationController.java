package com.hehe.web;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hehe.security.RegistrationForm;
import com.hehe.store.UserRepository;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    
    private UserRepository userRepo;
    
    public RegistrationController(
        UserRepository userRepo) {
        this.userRepo = userRepo;
    }
    
    @GetMapping
    public String registerForm() {
        return "registration";
    }
    
    @PostMapping
    public String processRegistration(RegistrationForm form) {
        userRepo.save(form.toUser(new BCryptPasswordEncoder()));
        return "redirect:/login";
    }
}