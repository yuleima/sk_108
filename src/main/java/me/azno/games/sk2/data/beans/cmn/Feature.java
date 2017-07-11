package me.azno.games.sk2.data.beans.cmn;

public class Feature {
	byte code;
	String name;	

	public byte getCode() {
		return code;
	}

	public void setCode(byte code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Feature{" +
				"code=" + code +
				", name='" + name + '\'' +
				'}';
	}
}
