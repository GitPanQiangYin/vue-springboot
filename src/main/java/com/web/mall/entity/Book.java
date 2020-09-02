package com.web.mall.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Administrator
 * @date 2020/9/2 14:12
 */

@Entity
@Data
@Table(name = "book")
public class Book {
    @Id
    String id ;
    @ManyToOne
    @JoinColumn(name = "cid")
    private  Category category;
    String cover;
    String title;
    String author;
    String date;
    String press;
    String abs;
}
