package com.web.mall.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 * @date 2020/9/2 14:17
 */
@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "id")
    String id ;
    String name ;
}
