package com.rexen.mapper;

import com.rexen.model.User;

public interface UserMapper extends MybatisMapper<User> {
	public abstract User getUserInfo(User user);
}
