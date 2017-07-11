package me.azno.games.sk2.data.beans.cmn;

import java.util.List;

public class Item {
	short code;
	byte type;
	String name;
	short unk1;
	String description;
//	short sizeOfEffects;
	List<Effect> effects;

	public short getCode() {
		return code;
	}

	public void setCode(short code) {
		this.code = code;
	}

	public byte getType() {
		return type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getUnk1() {
		return unk1;
	}

	public void setUnk1(short unk1) {
		this.unk1 = unk1;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public short getSizeOfEffects() {
//		return sizeOfEffects;
//	}
//
//	public void setSizeOfEffects(short sizeOfEffects) {
//		this.sizeOfEffects = sizeOfEffects;
//	}

	public List<Effect> getEffects() {
		return effects;
	}

	public void setEffects(List<Effect> effects) {
		this.effects = effects;
	}

	@Override
	public String toString() {
		StringBuilder sbEffects = new StringBuilder("[");
		for (int i = 0; i < effects.size(); i++) {
			sbEffects.append(effects.get(i).getCode());
			sbEffects.append("\t");
			sbEffects.append(effects.get(i).getAddition());
			if (i < effects.size() - 1) {
				sbEffects.append(" , ");
			}
		}
		sbEffects.append("]");
		return "" + code + "\t" + type + "\t" + name + "\t" + unk1 + "\t" + description + "\t" + sbEffects;
	}

}
