package com.web.mall.service;

import com.web.mall.dao.BookDao;
import com.web.mall.entity.Book;
import com.web.mall.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/9/2 15:03
 */
@Service
public class BookServiceImpl  implements BookService{
    @Autowired
    private BookDao bookDao;
    @Autowired CategoryService categoryService;

    @Override
    public List<Book> findAll() {
        Sort sort = new Sort(Sort.Direction.DESC,"id");

        return bookDao.findAll(sort);
    }

    @Override
    public void addOrUpdate(Book book) {
        bookDao.save(book);
    }

    @Override
    public void deleteById(String id) {
        bookDao.deleteById(id);
    }

    @Override
    public List<Book> findByCategory(String cid) {
        Category category = categoryService.get(cid);
        return bookDao.findAllByCategory(category);
    }
}
