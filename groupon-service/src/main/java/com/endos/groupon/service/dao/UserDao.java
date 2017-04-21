package com.endos.groupon.service.dao;

import com.endos.groupon.service.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Endos on 2017/04/21.
 */
public interface UserDao {

    /**
     * 通过ID获取用户
     * @param id
     * @return
     */
    User getById(@Param("id") Long id);

    /**
     * 通过用户名获取用户
     * @param name
     * @return
     */
    User getByName(@Param("name") String name);

    /**
     * 保存用户
     * @param password
     * @param name
     * @return
     */
    int save(@Param("password") String password,@Param("name") String name);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int update(User user);

}
