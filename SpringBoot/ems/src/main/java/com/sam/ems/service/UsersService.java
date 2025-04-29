package com.sam.ems.service;

import com.sam.ems.model.Users;
import org.springframework.stereotype.Service;

@Service
public interface UsersService {
    Users registerUser(Users newUser);
}
