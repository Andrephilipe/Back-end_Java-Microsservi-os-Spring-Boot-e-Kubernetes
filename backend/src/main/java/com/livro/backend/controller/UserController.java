package com.livro.backend.controller;

import com.livro.backend.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/")
    public String getMensagem() {
        return "Spring boot is working";
    }
    @GetMapping("/users")
    public List<UserDTO> getUsers(){
        return usuarios;
    }

    public static List<UserDTO> usuarios = new ArrayList<UserDTO>();
    @PostConstruct
    public void initiateList() {
        UserDTO userDTO = new UserDTO();
        userDTO.setNome("Eduardo");
        userDTO.setCpf("123");
        userDTO.setEndereco("Rua alguma coisa");
        userDTO.setEmail("123@gmail.com");
        userDTO.setTelefone("1234-99897");
        userDTO.setDataCadastro(new Date());

        usuarios.add(userDTO);

    }

}
