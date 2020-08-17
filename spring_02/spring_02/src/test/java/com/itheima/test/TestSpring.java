package com.itheima.test;

import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class TestSpring {
    @Test
    public void test01(){
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationConfig.xml");


        //DataSource dataSource = (DataSource) act.getBean("DataSource");
        //        //
        DataSource dataSource = (DataSource) act.getBean("dataSource");
        System.out.println(dataSource);

    }
}
