package com.wan.blog.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wan.blog.admin.pojo.Admin;
import com.wan.blog.admin.pojo.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface AdminMapper extends BaseMapper<Admin> {
    @Select("SELECT * FROM wan_permission where id in (select permission_id from wan_admin_permission where admin_id=#{adminId})")
    List<Permission> findAdminByAdminId(Long adminId);
}
