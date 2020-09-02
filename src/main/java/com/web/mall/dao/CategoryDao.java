package com.web.mall.dao;

import com.web.mall.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Administrator
 * @date 2020/9/2 14:25
 */
@Mapper
public interface CategoryDao extends JpaRepository<Category,String> {

}
