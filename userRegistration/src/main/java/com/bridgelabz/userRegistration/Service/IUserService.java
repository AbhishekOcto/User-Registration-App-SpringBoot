package com.bridgelabz.userRegistration.Service;

import com.bridgelabz.userRegistration.Entity.User;
import com.bridgelabz.userRegistration.dto.UserDTO;

public interface IUserService {

    User addUser(UserDTO userDTO);
}
