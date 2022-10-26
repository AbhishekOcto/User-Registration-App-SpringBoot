package com.bridgelabz.userRegistration.Service;

import com.bridgelabz.userRegistration.Entity.User;
import com.bridgelabz.userRegistration.Repository.UserRepository;
import com.bridgelabz.userRegistration.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User addUser(UserDTO userDTO) {
        String encodedPassword = bCryptPasswordEncoder.encode(userDTO.getPassword());
        userDTO.setPassword(encodedPassword);
        User user = modelMapper.map(userDTO, User.class);
        return userRepository.save(user);
    }
}
