package com.endos.user.entity;

import com.endos.framework.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 用户实体类
 * Created by Endos on 2017/04/19.
 */
public class User extends BaseEntity {
    /* 密码 */
    @Getter @Setter private String password;
    /* 用户名 */
    @Getter @Setter private String name;
    /* 登陆时间 */
    @Getter @Setter private Date loginTime;
    /* 创建时间 */
    @Getter @Setter private Date createTime;
    /* 更新时间 */
    @Getter @Setter private Date updateTime;

}
