package com.web.mall.entity;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Administrator
 * @date 2020/8/31 9:37
 */


@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue
    private String id;
    private String username;
    private String password;

}
