package com.rpg.util.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Template {

    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {

        if (sqlSessionFactory == null) {
            String resource = "config/mybatis.xml";
            try(InputStream configFile = Resources.getResourceAsStream(resource)) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(configFile);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        return sqlSessionFactory.openSession(false);
    }


}
