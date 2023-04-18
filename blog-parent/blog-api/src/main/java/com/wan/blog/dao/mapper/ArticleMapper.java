package com.wan.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wan.blog.dao.dos.Archives;
import com.wan.blog.dao.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface ArticleMapper extends BaseMapper<Article> {
    /**
     * 文章归档
     * @return
     */
    List<Archives> listArchives();

    IPage<Article> listArticle(Page<Article> page,
                               Long categoryId,
                               Long tagId,
                               String year,
                               String month);

}
