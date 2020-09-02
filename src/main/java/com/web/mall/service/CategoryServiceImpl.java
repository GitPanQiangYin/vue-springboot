package com.web.mall.service;

import com.web.mall.dao.CategoryDao;
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
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDao categoryDao;


    @Override
    public List<Category> findAll() {
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        return categoryDao.findAll(sort);
    }

    @Override
    public Category get(String id){
        return categoryDao.findById(id).orElse(null);
    }
}
