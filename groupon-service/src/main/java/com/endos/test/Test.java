package com.endos.test;

import com.endos.user.entity.User;

import java.util.Date;

/**
 * Created by Endos on 2017/04/19.
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        Date now = new Date();
        user.setCreateTime(now);
        user.setLoginTime(now);
        user.setName("Endos");
        user.setPassword("1234");
        user.setUpdateTime(now);
        user.setId(1001L);
        user.setRouterCall("123");
        System.out.println(user.getCreateTime());
        System.out.println(user.toString());
    }
}
