package me.azno.games.sk2.data;

import java.util.List;

/**
 * Created by yulei.ma on 2017/7/10.
 */
public interface IParseList<T> extends IHandleWithBinaryBlock {
    List<T> parse();
}
