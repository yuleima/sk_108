package me.azno.games.sk2.data.parser.cmn;

import me.azno.games.sk2.data.parser.AbstractDataListParser;

/**
 * Created by yulei.ma on 2017/7/10.
 */
public class HeroFeatureListParser extends AbstractDataListParser<Byte> {


    @Override
    protected void parseData() {
        this.dataList.add(binaryBlock.getByte());
    }

}
