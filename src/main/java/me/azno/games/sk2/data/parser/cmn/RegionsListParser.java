package me.azno.games.sk2.data.parser.cmn;

import me.azno.games.sk2.data.IParseList;
import me.azno.games.sk2.data.beans.cmn.Effect;
import me.azno.games.sk2.data.beans.cmn.Item;
import me.azno.games.sk2.data.beans.cmn.Region;
import me.azno.games.sk2.data.parser.AbstractDataListParser;

import java.util.List;

/**
 * Created by yulei.ma on 2017/7/10.
 */
public class RegionsListParser extends AbstractDataListParser<Region> {
    IParseList<Byte> neighborsParser ;

    @Override
    protected void parseData() {
        Region region = new Region();
        this.dataList.add(region);
        region.setCode(binaryBlock.getByte());
        region.setName(binaryBlock.getString(10));
        region.setUnk1(binaryBlock.getByte());
        neighborsParser.setBinaryBlock(binaryBlock);
        List<Byte> neighbors = neighborsParser.parse();
        region.setNeighbors(neighbors);
    }

    public void setNeighborsParser(IParseList<Byte> neighborsParser) {
        this.neighborsParser = neighborsParser;
    }
}
