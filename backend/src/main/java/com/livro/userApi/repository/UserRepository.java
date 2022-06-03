package com.livro.userApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livro.userApi.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findBycpf(String cpf);

    List<User> queryByNomeLike(String name);
}