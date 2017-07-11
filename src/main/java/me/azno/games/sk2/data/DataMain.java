package me.azno.games.sk2.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 测试在DataTest下，不必再显示启动了
 * Created by yulei.ma on 2017/7/10.
 */
@Deprecated
public class DataMain {
    public final static String CONFIG_PATH = "";
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_PATH + "beans.xml");
        CmnDataLoader cmnDataLoader = (CmnDataLoader)context.getBean("cmnDataLoader");
        cmnDataLoader.load();
    }
}
