package me.azno.games.sk2.data.parser;

import me.azno.games.sk2.data.IBinaryBlock;
import me.azno.games.sk2.data.IParseList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yulei.ma on 2017/7/10.
 */
public abstract class AbstractDataListParser<T> implements IParseList<T>{
    protected final static Logger logger = LoggerFactory.getLogger("");
    protected IBinaryBlock binaryBlock;
    protected List<T> dataList;

    protected AbstractDataListParser(IBinaryBlock binaryBlock) {
        this.binaryBlock = binaryBlock;
    }

    protected AbstractDataListParser() {
    }


    @Override
    public List<T> parse() {
        if (binaryBlock == null)
            throw new NullBinaryBlockException();
        short size = binaryBlock.getShort();
//        logger.info("{}",size);
        dataList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            parseData();
        }
        return dataList;
    }

    protected abstract void parseData();


    @Override
    public IBinaryBlock getBinaryBlock() {
        return binaryBlock;
    }

    @Override
    public void setBinaryBlock(IBinaryBlock binaryBlock) {
        this.binaryBlock = binaryBlock;
    }
}
