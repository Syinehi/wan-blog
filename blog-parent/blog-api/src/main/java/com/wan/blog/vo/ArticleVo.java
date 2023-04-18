package com.wan.blog.vo;

//import com.wan.blog.dao.pojo.ArticleBody;
//import com.wan.blog.dao.pojo.Category;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.wan.blog.dao.pojo.SysUser;
import com.wan.blog.dao.pojo.Tag;
import lombok.Data;

import java.util.List;

@Data
public class ArticleVo {

    @JsonSerialize(using = ToStringSerializer.class)
    private String id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    private Integer weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

//    private List<CategoryVo> categorys;

//    private TagVo tag;

    private CategoryVo category;
}

