package me.azno.games.sk2.data.parser.cmn;

import me.azno.games.sk2.data.IParseList;
import me.azno.games.sk2.data.beans.cmn.Hero;
import me.azno.games.sk2.data.parser.AbstractDataListParser;

import java.util.List;

/**
 * Created by yulei.ma on 2017/7/10.
 */
public class HeroListParser extends AbstractDataListParser<Hero> {
    IParseList<Byte> featuresParser;

    @Override
    protected void parseData() {
        Hero hero = new Hero();
        this.dataList.add(hero);
        hero.setCode(binaryBlock.getShort());
        hero.setName(binaryBlock.getString(26));
        hero.setNickName(binaryBlock.getString(26));
        hero.setZhong(binaryBlock.getByte());
        hero.setRen(binaryBlock.getByte());
        hero.setYong(binaryBlock.getByte());
        hero.setPhysical(binaryBlock.getByte());
        hero.setGender(binaryBlock.getByte());
        hero.setAge(binaryBlock.getByte());
        hero.setCharacter(binaryBlock.getByte());
        hero.setHeroClass(binaryBlock.getByte());
        hero.setWeapon(binaryBlock.getByte());
        hero.setIntroduction(binaryBlock.getString(148));
        hero.setPortrait(binaryBlock.getShort());
        hero.setModeling(binaryBlock.getShort());

        featuresParser.setBinaryBlock(binaryBlock);
        List<Byte> features = featuresParser.parse();
        hero.setFeatures(features);

    }

    public void setFeaturesParser(IParseList<Byte> featuresParser) {
        this.featuresParser = featuresParser;
    }
}
