package com.wan.blog.service;

import com.wan.blog.dao.pojo.Tag;
import com.wan.blog.vo.Result;
import com.wan.blog.vo.TagVo;

import java.util.List;

public interface TagService {

    List<TagVo> findTagsByArticleId(long articleId);

    Result hots(int limit);
    //查询所有的文章标签
    Result findAll();

    Result findAllDetail();

    Result findDetailById(Long id);
}
