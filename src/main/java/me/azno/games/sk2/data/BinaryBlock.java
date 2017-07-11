package me.azno.games.sk2.data;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/**
 * Created by yulei.ma on 2017/7/11.
 */
public class BinaryBlock implements IBinaryBlock {
    private ByteBuffer buffer;
    private String charset = "GBK";

    public BinaryBlock(ByteBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public int getInt() {
        return buffer.getInt();
    }

    @Override
    public byte getByte() {
        return buffer.get();
    }

    @Override
    public short getShort() {
        return buffer.getShort();
    }

    @Override
    public String getString(int size) {
        String string = null;
        try {
            string = new String(getBytes(size), this.charset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return string;
    }

    @Override
    public byte[] getBytes(int size) {
        byte[] bytes = new byte[size];
        buffer.get(bytes);
        return bytes;
    }
}
