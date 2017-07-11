package me.azno.games.sk2.data.parser.cmn;

import me.azno.games.sk2.data.beans.cmn.Effect;
import me.azno.games.sk2.data.beans.cmn.Fort;
import me.azno.games.sk2.data.parser.AbstractDataListParser;

/**
 * Created by yulei.ma on 2017/7/10.
 */
public class FortListParser extends AbstractDataListParser<Fort> {

    @Override
    protected void parseData() {
        Fort fort = new Fort();
        this.dataList.add(fort);
        fort.setCode(binaryBlock.getShort());
        fort.setName(binaryBlock.getString(17));
        fort.setRegion(binaryBlock.getByte());
        fort.setUnk1(binaryBlock.getByte());
        fort.setX(binaryBlock.getShort());
        fort.setY(binaryBlock.getShort());
        fort.setIntroduction(binaryBlock.getString(201));
    }

}
