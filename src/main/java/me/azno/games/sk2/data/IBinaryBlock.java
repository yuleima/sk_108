package me.azno.games.sk2.data;

/**
 * Created by yulei.ma on 2017/7/11.
 */
public interface IBinaryBlock {
    int getInt();
    byte getByte();
    short getShort();
    String getString(int size);
    byte[] getBytes(int size);
}
