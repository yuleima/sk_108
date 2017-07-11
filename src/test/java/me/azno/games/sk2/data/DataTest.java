package me.azno.games.sk2.data;

import me.azno.test.BaseJunit4Test;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by yulei.ma on 2017/7/11.
 */
public class DataTest extends BaseJunit4Test {
    @Resource
    private CmnDataLoader cmnDataLoader;
    @Test
    public void cmnLoad() throws IOException {
        cmnDataLoader.load();

    }
}
