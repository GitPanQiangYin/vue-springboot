package com.web.mall.service;

import com.web.mall.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2020/8/31 14:56
 */
@Service
public interface UserService {

    User getUserByLoginName(String loginname,String password);
}
