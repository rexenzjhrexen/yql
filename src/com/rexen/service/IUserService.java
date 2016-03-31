package com.rexen.service;

import com.rexen.model.User;

public interface IUserService extends IService<User>{
	public abstract User getUserInfo(User user);
}
