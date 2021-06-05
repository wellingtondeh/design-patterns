package br.com.wbs.creational.prototype;

public class Prototype implements Cloneable {

	private String attributeA;
	private String attributeB;
	private SubPrototype subPrototype;

	public String getAttributeA() {
		return attributeA;
	}

	public void setAttributeA(String attributeA) {
		this.attributeA = attributeA;
	}

	public String getAttributeB() {
		return attributeB;
	}

	public void setAttributeB(String attributeB) {
		this.attributeB = attributeB;
	}

	public SubPrototype getSubPrototype() {
		return subPrototype;
	}

	public void setSubPrototype(SubPrototype subPrototype) {
		this.subPrototype = subPrototype;
	}

	public Prototype clone() throws CloneNotSupportedException {
		return (Prototype) super.clone();
	}
}
