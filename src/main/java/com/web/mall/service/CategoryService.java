package com.web.mall.service;

import com.web.mall.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/9/2 15:02
 */
@Service
public interface CategoryService {

    List<Category> findAll();
    Category get(String id);
}
