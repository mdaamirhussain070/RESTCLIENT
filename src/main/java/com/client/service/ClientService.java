package com.client.service;

import com.client.utility.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public interface ClientService {
    public List<User> getAllUsers();
}
