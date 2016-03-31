package com.rexen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rexen.mapper.UserMapper;
import com.rexen.mapper.MybatisMapper;
import com.rexen.model.User;

@Service
public class IUserServiceImpl extends AbstractService<User> implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	protected MybatisMapper<User> getMapper() {
		return userMapper;
	}

	@Override
	public User getUserInfo(User user) {
		return userMapper.getUserInfo(user);
	}

}
