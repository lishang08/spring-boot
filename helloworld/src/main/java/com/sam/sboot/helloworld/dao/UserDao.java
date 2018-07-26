package com.sam.sboot.helloworld.dao;


import com.sam.sboot.helloworld.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
