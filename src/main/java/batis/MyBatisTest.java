package batis;

import batis.mapper.TableAMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by dorianns on 15/11/30.
 */
public class MyBatisTest {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        String resource = "batis/mybatis.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            try {
                TableAMapper mapper = session.getMapper(TableAMapper.class);
                String name = mapper.selectTableA(1);
                System.out.println(name);
            } finally {
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
