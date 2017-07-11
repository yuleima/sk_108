package me.azno.games.sk2.data.beans.cmn;

public class Fort {
	short code;
	String name;
	byte region;
	byte unk1;
	short x;
	short y;
	String introduction;

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

	public byte getRegion() {
		return region;
	}

	public void setRegion(byte region) {
		this.region = region;
	}

	public byte getUnk1() {
		return unk1;
	}

	public void setUnk1(byte unk1) {
		this.unk1 = unk1;
	}

	public short getX() {
		return x;
	}

	public void setX(short x) {
		this.x = x;
	}

	public short getY() {
		return y;
	}

	public void setY(short y) {
		this.y = y;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Override
	public String toString() {
		return "Fort{" +
				"code=" + code +
				", name='" + name + '\'' +
				", region=" + region +
				", unk1=" + unk1 +
				", x=" + x +
				", y=" + y +
				", introduction='" + introduction + '\'' +
				'}';
	}
}
