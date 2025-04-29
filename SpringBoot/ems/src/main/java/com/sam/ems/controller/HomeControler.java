package com.sam.ems.controller;

import com.sam.ems.model.Users;
import com.sam.ems.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HomeControler {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/welcome")
    public String hello(HttpServletRequest request){
        return "Welcome to EMS #### "+request.getSession().getId();
    }

    @GetMapping("/csrf-token")
    public CsrfToken csrfToken(HttpServletRequest request){
        return getCsrfToken(request);
    }

    private CsrfToken getCsrfToken(HttpServletRequest request) {
      return (CsrfToken) request.getAttribute("_csrf");
    }


    @PostMapping("/addUser")
    public String addingUser(@RequestBody  Users users){
        return "Users  added ..."+users.getUsername();
    }


    @GetMapping("/getUsers")
    public String getUsers(@RequestParam String userName){
        return "Users  added ..."+userRepo.findByUsername(userName);
    }

}
