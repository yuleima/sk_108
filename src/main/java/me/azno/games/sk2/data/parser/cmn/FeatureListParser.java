package me.azno.games.sk2.data.parser.cmn;

import me.azno.games.sk2.data.beans.cmn.Feature;
import me.azno.games.sk2.data.parser.AbstractDataListParser;

/**
 * Created by yulei.ma on 2017/7/10.
 */
public class FeatureListParser extends AbstractDataListParser<Feature> {

    @Override
    protected void parseData() {
        Feature feature = new Feature();
        this.dataList.add(feature);
        feature.setCode(binaryBlock.getByte());
        feature.setName(binaryBlock.getString(11));
    }

}
