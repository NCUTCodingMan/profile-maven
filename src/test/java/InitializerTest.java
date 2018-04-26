import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author rain
 * created on 2018/4/26
 */
public class InitializerTest {
    private static final String PARAM = "applicationContext.xml";

    @Test
    public void ioc() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(PARAM);
        DriverManagerDataSource dataSource = (DriverManagerDataSource) ctx.getBean("dataSource");
        println(dataSource.getUsername());
        println(dataSource.getPassword());
        println(dataSource.getUrl());
    }

    private static void println(String param) {
        System.out.println(param);
    }
}