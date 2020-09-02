package com.web.mall.service;

import com.web.mall.entity.Book;
import com.web.mall.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/9/2 15:03
 */
@Service
public interface BookService {

    List<Book> findAll();

    void addOrUpdate(Book book);

    void deleteById(String id);

    List<Book> findByCategory(String cid);
}
