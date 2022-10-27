package com.bridgelabz.userRegistration.Service;

import com.bridgelabz.userRegistration.Entity.User;
import com.bridgelabz.userRegistration.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    User addUser(UserDTO userDTO);
    Optional<User> getUserById(long id);

    List<User> getUserData();
//    void deleteUser(long id);
}
