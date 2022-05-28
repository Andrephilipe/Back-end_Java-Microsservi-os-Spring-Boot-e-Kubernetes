package com.livro.userApi.controller;

import com.livro.userApi.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

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

        UserDTO userDTO2 = new UserDTO();
        userDTO.setNome("Eduardo Campos");
        userDTO.setCpf("1233");
        userDTO.setEndereco("Rua alguma coisa");
        userDTO.setEmail("123@gmail.com");
        userDTO.setTelefone("1234-99897");
        userDTO.setDataCadastro(new Date());

        usuarios.add(userDTO);
        usuarios.add(userDTO2);

    }
    @GetMapping("/users/{cpf}")
    public UserDTO getUsersFiltro(@PathVariable String cpf) {
        for(UserDTO userFilter: usuarios) {
            if (userFilter.getCpf().equals(cpf)){
                return userFilter;
            }
        }
        return null;
    }

    @PostMapping("/newUser")
    UserDTO inserir(@RequestBody UserDTO userDTO) {
        userDTO.setDataCadastro(new Date());
        usuarios.add(userDTO);
        return userDTO;
    }

    @DeleteMapping("/users/{cpf}")
    public boolean remover(@PathVariable String cpf) {
        for (UserDTO userFilter: usuarios) {
            if (userFilter.getCpf().equals(cpf)) {
                usuarios.remove(userFilter);
                return true;
            }
        }
        return false;
    }

}
