package com.wan.blog.service;

import com.wan.blog.vo.CategoryVo;
import com.wan.blog.vo.Result;

import java.util.List;

public interface CategoryService {
    //通过id查询类别
    CategoryVo findCategoryById(Long categoryId);

    //所有类别查询
    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
