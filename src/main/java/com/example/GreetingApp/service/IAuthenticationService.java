package com.example.GreetingApp.service;
import com.example.GreetingApp.DTO.AuthUserDTO;
<<<<<<< HEAD
import com.example.GreetingApp.DTO.LoginDTO;
import com.example.GreetingApp.model.AuthUser;

=======

import com.example.GreetingApp.model.AuthUser;
>>>>>>> UC9-Registertheuser

public interface IAuthenticationService {
    AuthUser register(AuthUserDTO userDTO) throws Exception;

<<<<<<< HEAD
    String login(LoginDTO loginDTO);
=======
>>>>>>> UC9-Registertheuser
}
