package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.UserDao;
import com.sam.entity.User;
import com.sam.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public List<User> getUserList() {
		return userDao.findAll();
	}

	public User findUserById(long id) {
		return userDao.findById(id);
	}

	public void save(User user) {
		userDao.save(user);
	}

	public void edit(User user) {
		userDao.save(user);
	}

	public void delete(long id) {
		userDao.delete(id);
	}

}
