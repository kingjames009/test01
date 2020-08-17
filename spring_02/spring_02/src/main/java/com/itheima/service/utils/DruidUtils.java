package com.itheima.service.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DruidUtils {
    private static DataSource dataSource;


    static {
        try {
            //1. 创建properties文件
            Properties properties = new Properties();
            // 2. 将配置文件转换成字节输入流
            InputStream is = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            // 3.加载配置文件
            properties.load(is);
            // 4.加载配置文件，获取datasource对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public DataSource getDataSource(){
        System.out.println("实例工厂实例化bean的方法");
        return dataSource;
    }
}
