package com.endos.groupon.service.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 用户基本信息
 * Created by Endos on 2017/04/19.
 */
public class UserBasicInfo extends BaseEntity {
    /* 昵称 */
    @Getter @Setter private String nickName;
    /* 真实姓名 */
    @Getter @Setter private String realName;
    /* 邮箱 */
    @Getter @Setter private String mail;
    /* 电话 */
    @Getter @Setter private String phone;
    /* 创建时间 */
    @Getter @Setter private Date createTime;
    /* 更新时间 */
    @Getter @Setter private Date updateTime;
}
