package com.voluntariado.comedores.services;

import com.voluntariado.comedores.dto.UserDTO;
import com.voluntariado.comedores.entities.User;
import com.voluntariado.comedores.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO crearUsuario(UserDTO userDTO) {
        //Convertir el DTO a entidad
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setUsername(userDTO.getUsername());
        user.setRol(userDTO.getRol());

        User nuevoUser = userRepository.save(user);

        //Convertir la entidad a DTO
        UserDTO usuarioRespuesta = new UserDTO();
        usuarioRespuesta.setId(nuevoUser.getId());
        usuarioRespuesta.setFirstName(nuevoUser.getFirstName());
        usuarioRespuesta.setLastName(nuevoUser.getLastName());
        usuarioRespuesta.setEmail(nuevoUser.getEmail());
        usuarioRespuesta.setUsername(nuevoUser.getUsername());
        usuarioRespuesta.setRol(nuevoUser.getRol());

        return usuarioRespuesta;
    }
}
