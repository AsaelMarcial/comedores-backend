package com.voluntariado.comedores.controllers;

import com.voluntariado.comedores.dto.UserDTO;
import com.voluntariado.comedores.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> guardarUsuario(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(userService.crearUsuario(userDTO), HttpStatus.CREATED);
    }

}
