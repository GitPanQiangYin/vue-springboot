package com.web.mall.dao;

import com.web.mall.entity.Book;
import com.web.mall.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/9/2 14:25
 */
@Mapper
public interface BookDao extends JpaRepository<Book,String> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1,String keyword2);
}
