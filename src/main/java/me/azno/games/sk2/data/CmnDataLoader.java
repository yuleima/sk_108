package me.azno.games.sk2.data;

import me.azno.games.sk2.data.beans.cmn.*;

import java.util.List;

/**
 * Created by yulei.ma on 2017/7/10.
 */
public class CmnDataLoader extends AbstractLoader {

    IParseList<Item> itemsParser;
    IParseList<Feature> featuresParser;
    IParseList<Region> regionsParser;
    IParseList<Fort> fortsParser;
    IParseList<Hero> herosParser;

    public CmnDataLoader(String path, String fileName) {
        super(path, fileName);
    }

    @Override
    protected void handleParse() {
        // todo 代码可以简化
        // 泛型的类别不好确定
        itemsParser.setBinaryBlock(blocks.get(0));
        List<Item> items = itemsParser.parse();

        featuresParser.setBinaryBlock(blocks.get(1));
        List<Feature> features = featuresParser.parse();

        regionsParser.setBinaryBlock(blocks.get(2));
        List<Region> regions = regionsParser.parse();

        fortsParser.setBinaryBlock(blocks.get(3));
        List<Fort> forts = fortsParser.parse();

        herosParser.setBinaryBlock(blocks.get(4));
        List<Hero> heroes = herosParser.parse();

//        items.forEach(item -> logger.info("{}",item));
//        features.forEach(feature -> logger.info("{}",feature));
//        regions.forEach(region -> logger.info("{}",region));
//        forts.forEach(fort -> logger.info("{}",fort));
        heroes.forEach(hero -> logger.info("{}", hero));
    }

    public void setItemsParser(IParseList<Item> itemsParser) {
        this.itemsParser = itemsParser;
    }

    public void setFeaturesParser(IParseList<Feature> featuresParser) {
        this.featuresParser = featuresParser;
    }

    public void setRegionsParser(IParseList<Region> regionsParser) {
        this.regionsParser = regionsParser;
    }

    public void setFortsParser(IParseList<Fort> fortsParser) {
        this.fortsParser = fortsParser;
    }

    public void setHerosParser(IParseList<Hero> herosParser) {
        this.herosParser = herosParser;
    }
}
