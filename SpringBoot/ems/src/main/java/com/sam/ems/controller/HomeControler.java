package com.sam.ems.controller;

import com.sam.ems.model.Users;
import com.sam.ems.repository.UserRepository;
import com.sam.ems.service.UsersService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/ems")
public class HomeControler {
    @Autowired
    private UsersService usersService;

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
    public Users addingUser(@RequestBody  Users users){
        return usersService.registerUser(users);
    }

    @GetMapping("/getUsers")
    public String getUsers(@RequestParam String userName){
      // return "Users  pulled is... "+usersService.findByUsername(userName).getUsername();
        //return "Users  added ..."+userName;
        return userName;
    }

}
