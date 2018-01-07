package com.wuqi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuqi.dao.UserMapper;
import com.wuqi.entity.User;
import com.wuqi.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(int id) {
		System.out.println("进来了....");
		User user = userMapper.selectByPrimaryKey(1);
		return user;
//		return null;
	}

}
