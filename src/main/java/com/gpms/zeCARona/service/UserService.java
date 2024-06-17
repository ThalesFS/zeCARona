package com.gpms.zeCARona.service;


import com.gpms.zeCARona.DTO.RegisterUserDTO;
import com.gpms.zeCARona.entity.User;
import com.gpms.zeCARona.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(RegisterUserDTO registerUserDTO){

        User user = new User();
        user.setNome(registerUserDTO.getNome());
        user.setEmail(registerUserDTO.getEmail());
        user.setSenha(registerUserDTO.getSenha());

        userRepository.save(user);
    }
}
