package me.azno.games.sk2.data.beans.cmn;

import java.util.List;

public class Hero {
	short code;
	String name;
	String nickName;
	byte zhong;
	byte ren;
	byte yong;
	byte physical;
	byte gender;
	byte age;
	byte character;
	byte heroClass;
	byte weapon;
	String introduction;
	short portrait;
	short modeling;
	List<Byte> features;

	public short getCode() {
		return code;
	}

	public void setCode(short code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public byte getZhong() {
		return zhong;
	}

	public void setZhong(byte zhong) {
		this.zhong = zhong;
	}

	public byte getRen() {
		return ren;
	}

	public void setRen(byte ren) {
		this.ren = ren;
	}

	public byte getYong() {
		return yong;
	}

	public void setYong(byte yong) {
		this.yong = yong;
	}

	public byte getPhysical() {
		return physical;
	}

	public void setPhysical(byte physical) {
		this.physical = physical;
	}

	public byte getGender() {
		return gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public byte getCharacter() {
		return character;
	}

	public void setCharacter(byte character) {
		this.character = character;
	}

	public byte getHeroClass() {
		return heroClass;
	}

	public void setHeroClass(byte heroClass) {
		this.heroClass = heroClass;
	}

	public byte getWeapon() {
		return weapon;
	}

	public void setWeapon(byte weapon) {
		this.weapon = weapon;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public short getPortrait() {
		return portrait;
	}

	public void setPortrait(short portrait) {
		this.portrait = portrait;
	}

	public short getModeling() {
		return modeling;
	}

	public void setModeling(short modeling) {
		this.modeling = modeling;
	}



	public List<Byte> getFeatures() {
		return features;
	}

	public void setFeatures(List<Byte> features) {
		this.features = features;
	}

	@Override
	public String toString() {
		StringBuilder sbFeatures = new StringBuilder("[");
		for (int i = 0; i < features.size(); i++) {
			sbFeatures.append(features.get(i));
			if (i < features.size() - 1) {
				sbFeatures.append(" , ");
			}
		}
		sbFeatures.append("]");
		return "Hero{" +
				"code=" + code +
				", name='" + name + '\'' +
				", nickName='" + nickName + '\'' +
				", zhong=" + zhong +
				", ren=" + ren +
				", yong=" + yong +
				", physical=" + physical +
				", gender=" + gender +
				", age=" + age +
				", character=" + character +
				", heroClass=" + heroClass +
				", weapon=" + weapon +
				", introduction='" + introduction + '\'' +
				", portrait=" + portrait +
				", modeling=" + modeling +
				", features=" + sbFeatures +
				'}';
	}
}
