package com.livro.backend.dto;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDTO {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;
    private Date dataCadastro;

    public static List<UserDTO> usuarios = new ArrayList<UserDTO>();
    @PostConstruct
    public void initiateList() {
        UserDTO userDTO = new UserDTO();
        UserDTO.setNome("Eduardo");
        UserDTO.setCpf("123");
        UserDTO.setEndereco("Rua alguma coisa");
        UserDTO.setEmail("123@gmail.com");
        UserDTO.setTelefone("1234-99897");
        UserDTO.setDataCadastro(new Date());

        usuarios.add(userDTO);

    }

}
