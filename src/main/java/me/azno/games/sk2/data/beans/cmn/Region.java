package me.azno.games.sk2.data.beans.cmn;

import java.util.List;

public class Region {
	byte code;
	String name;
	byte unk1;
	List<Byte> neighbors;

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

	public byte getUnk1() {
		return unk1;
	}

	public void setUnk1(byte unk1) {
		this.unk1 = unk1;
	}


	public List<Byte> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(List<Byte> neighbors) {
		this.neighbors = neighbors;
	}

	@Override
	public String toString() {
		StringBuilder sbNeighbors = new StringBuilder("[");
		for (int i = 0; i < neighbors.size(); i++) {
			sbNeighbors.append(neighbors.get(i));
			if (i < neighbors.size() - 1) {
				sbNeighbors.append(" , ");
			}
		}
		sbNeighbors.append("]");
		return "" + code + "\t" + name + "\t" + unk1 + "\t" + sbNeighbors;
	}

}
