package com.web.mall.service;

import com.web.mall.dao.UserDao;
import com.web.mall.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2020/8/31 14:57
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
     private UserDao userDao;

    @Override
    public User getUserByLoginName(String loginName,String password) {
        return userDao.getByUsernameAndPassword(loginName,password);
    }
}
