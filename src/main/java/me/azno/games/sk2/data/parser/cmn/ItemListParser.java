package me.azno.games.sk2.data.parser.cmn;

import me.azno.games.sk2.data.IParseList;
import me.azno.games.sk2.data.beans.cmn.Effect;
import me.azno.games.sk2.data.beans.cmn.Item;
import me.azno.games.sk2.data.parser.AbstractDataListParser;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * Created by yulei.ma on 2017/7/10.
 */
public class ItemListParser extends AbstractDataListParser<Item> {
    IParseList<Effect> effectsParser ;

//    public ItemListParser(ByteBuffer buff) {
//        super(buff);
//    }

    @Override
    protected void parseData() {
        Item item = new Item();
        this.dataList.add(item);
        item.setCode(binaryBlock.getShort());
        item.setType(binaryBlock.getByte());
        item.setName(binaryBlock.getString(17));
        item.setUnk1(binaryBlock.getShort());
        item.setDescription(binaryBlock.getString(121));
        effectsParser.setBinaryBlock(binaryBlock);
        List<Effect> effects = effectsParser.parse();
        item.setEffects(effects);
    }

    public void setEffectsParser(IParseList<Effect> effectsParser) {
        this.effectsParser = effectsParser;
    }
}
