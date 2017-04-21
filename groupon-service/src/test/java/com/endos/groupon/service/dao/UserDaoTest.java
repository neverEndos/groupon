package com.endos.groupon.service.dao;

import com.endos.groupon.service.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Endos on 2017/04/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void getById() throws Exception {
        User user = userDao.getById(1L);
        System.out.println(user);
    }

    @Test
    public void getByName() throws Exception {
        User user = userDao.getByName("road");
        System.out.println(user);
    }

    @Test
    public void save() throws Exception {
        String password = "123";
        String name = "endos";
        int result = userDao.save(password, name);
        System.out.println(result);
    }

    @Test
    public void update() throws Exception {
        User user = userDao.getByName("123");
        user.setPassword("1234566");
        System.out.println(user);
        int result = userDao.update(user);
        System.out.println(result);
    }

}