package me.azno.games.sk2.data.parser.cmn;

import me.azno.games.sk2.data.beans.cmn.Effect;
import me.azno.games.sk2.data.parser.AbstractDataListParser;

import java.nio.ByteBuffer;

/**
 * Created by yulei.ma on 2017/7/10.
 */
public class EffectListParser extends AbstractDataListParser<Effect> {


    @Override
    protected void parseData() {
        Effect effect = new Effect();
        this.dataList.add(effect);
        effect.setCode(binaryBlock.getByte());
        effect.setAddition(binaryBlock.getShort());
    }

}
