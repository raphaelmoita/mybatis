package org.moita.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisConfig {

    private static String CONFIG = "mybatis-config.xml";

    public static SqlSession session() throws IOException {
        try (InputStream inputStream = Resources.getResourceAsStream(CONFIG)) {
            SqlSessionFactory sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(inputStream);
            return sqlSessionFactory.openSession();
        } catch (IOException e) {
            // log.err
            throw e;
        }
    }
}
