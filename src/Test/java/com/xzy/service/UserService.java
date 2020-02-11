package com.xzy.service;

import com.xzy.dao.IUserDao;
import com.xzy.model.User;
import com.xzy.services.IUserService;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class UserService {

    @Resource
  private   IUserDao userDao;
    @Test
    public void testmysql(){
        List<User> users = userDao.getall();
        for (User u:users) {
            System.out.println("id"+u.getUser_ID()+"name"+u.getUser_name()+"pwd"+u.getUser_pwd());
            System.out.print(u.toString());
        }

    }

}
