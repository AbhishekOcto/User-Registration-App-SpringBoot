package com.bridgelabz.userRegistration.Controller;

import com.bridgelabz.userRegistration.Entity.User;
import com.bridgelabz.userRegistration.Service.UserServiceImpl;
import com.bridgelabz.userRegistration.dto.ResponseDTO;
import com.bridgelabz.userRegistration.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
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

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getUserData(){
        List<User> userList = null;
        userList = userService.getUserData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", userList);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{UserId}")
    public ResponseEntity<ResponseDTO> getUserById(@PathVariable("UserId")long id){
        Optional<User> user1 = null;
        user1 = userService.getUserById(id);
        ResponseDTO respDTO = new ResponseDTO("Get Call for Id Successfull", user1);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<ResponseDTO> deleteUser(@PathVariable("UserId")long id){
//        userService.deleteUser(id);
//        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted id: " +id);
//        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
//    }

}
