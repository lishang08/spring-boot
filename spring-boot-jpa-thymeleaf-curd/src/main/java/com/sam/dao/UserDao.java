package com.sam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

    User findById(long id);

    Long deleteById(long id);
}
