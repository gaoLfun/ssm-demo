package com.service.user.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.service.user.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
    public UserMapper userMapper;
    @Override
    public String findAge(String id) {
        // TODO Auto-generated method stub
        String age =userMapper.findAge(id);
        return age;
    }
}
