package com.bridgelabz.userRegistration.Controller;

import com.bridgelabz.userRegistration.Entity.User;
import com.bridgelabz.userRegistration.Service.UserServiceImpl;
import com.bridgelabz.userRegistration.dto.ResponseDTO;
import com.bridgelabz.userRegistration.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/add")
    public ResponseEntity<ResponseDTO> addUser(@RequestBody UserDTO userDTO){
//        userService.addUser(user);
        User user1 = userService.addUser(userDTO);
        ResponseDTO respDTO = new ResponseDTO("User Data Created", user1);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.CREATED);
    }

}
