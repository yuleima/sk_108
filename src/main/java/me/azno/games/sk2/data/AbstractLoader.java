package me.azno.games.sk2.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yulei.ma on 2017/7/11.
 */
public abstract class AbstractLoader implements ILoader {
    final static Logger logger = LoggerFactory.getLogger("");
    protected List<BinaryBlock> blocks = new ArrayList<>();
    protected String path;
    protected String fileName;

    public AbstractLoader(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
    }

    @Override
    public void load() throws IOException {
        FileInputStream ins = new FileInputStream(new File(getFilePath()));

        FileChannel channel = ins.getChannel();


        handlerFileHeader(channel, ins.available()).forEach(size -> {
            ByteBuffer buffer = ByteBuffer.allocate(size);
            try {
                channel.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            buffer.rewind();
            buffer.order(ByteOrder.LITTLE_ENDIAN);
            blocks.add(new BinaryBlock(buffer));
        });

        channel.close();
        ins.close();
        handleParse();
    }

    protected abstract void handleParse() ;

    private List<Integer> handlerFileHeader(FileChannel channel, int fileSize) throws IOException {

        ByteBuffer buffer = ByteBuffer.allocate(4);
        channel.read(buffer);

        buffer.rewind();
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        int offset = buffer.getInt();
        int start = offset, end;
        List<Integer> buffersSizes = new ArrayList<>();
        while (channel.position() < offset) {
            buffer.clear();
            channel.read(buffer);
            buffer.rewind();
            end = buffer.getInt();
//            logger.info("{} {} {}", start, end, end - start);
            buffersSizes.add(end - start);
            start = end;

        }
        end = fileSize + offset;
        // 文件末尾需要加偏移量
        buffersSizes.add(end - start + offset);
//        logger.info("{} {} {}", start, end, end - start);
        return buffersSizes;
    }

    private String getFilePath() {
        return path + "/" + fileName;
    }
}
