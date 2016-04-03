package com.yakshop.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="herd")
@XmlAccessorType(XmlAccessType.FIELD)
public class Herd {
	
	@XmlElement(name="labyak")
	private List<Labyak> labyaks;

	public List<Labyak> getLabyaks() {
		return labyaks;
	}

	public void setLabyaks(List<Labyak> labyaks) {
		this.labyaks = labyaks;
	}

	@Override
	public String toString() {
		return "Herd [labyaks=" + labyaks + "]";
	}

}
