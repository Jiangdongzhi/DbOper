package db;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by dorianns on 15/5/17.
 */
public class MySqlTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

        JdbcTemplate mysql = (JdbcTemplate) ctx.getBean("jdbcTemplate");

        String name = mysql.queryForObject("select name from tablea where id = 1", String.class);

        System.out.println("The name from database is:" + name);

    }

}
