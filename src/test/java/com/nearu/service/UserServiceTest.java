package com.nearu.service;

import com.nearu.model.User;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/*public class UserServiceTest {

    @Test
    public void insertUser() {
    }
}*/
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})

public class UserServiceTest {
    private static Logger logger = Logger.getLogger(UserServiceTest.class);
    private ApplicationContext ac = null;
    @Resource
    private UserService userService;

	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		userService = (UserService) ac.getBean("userService");
	}

    @Test
    public void test1() {
        User user = new User();
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(userService.insertUser(user));
    }
}