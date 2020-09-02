package com.web.mall.dao;

import com.web.mall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Administrator
 * @date 2020/8/31 14:58
 */

@Mapper
public interface UserDao extends JpaRepository<User,Integer> {
    User getUserByUsername(String username);

    User getByUsernameAndPassword(String username,String password);

}
