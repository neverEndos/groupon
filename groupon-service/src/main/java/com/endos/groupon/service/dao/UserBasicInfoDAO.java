package com.endos.groupon.service.dao;

import com.endos.groupon.service.entity.UserBasicInfo;

/**
 * Created by Endos on 2017/04/21.
 */
public interface UserBasicInfoDAO {

    /**
     * 通过ID获取用户基本信息
     * @param id
     * @return
     */
    UserBasicInfo getById(Long id);

    /**
     * 保存用户基本信息
     * @param info 用户
     * @return id
     */
    int save(UserBasicInfo info);

    /**
     * 更新用户基本信息
     * @param info
     * @return
     */
    int updateById(UserBasicInfo info);
}
