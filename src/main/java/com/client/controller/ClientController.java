package com.client.controller;

import com.client.service.ClientService;
import com.client.utility.ClientRouting;
import com.client.utility.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;
    @GetMapping(value = ClientRouting.GET_USER_LIST)
    public ResponseEntity<List<User>> getAllUsers(){

        List<User> userList=clientService.getAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
}
