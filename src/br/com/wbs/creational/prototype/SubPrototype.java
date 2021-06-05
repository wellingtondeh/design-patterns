package br.com.wbs.creational.prototype;

public class SubPrototype {

	private Integer attributeX;
	private Integer attributeY;
	private SubSubPrototype subSubPrototype;

	public Integer getAttributeX() {
		return attributeX;
	}

	public void setAttributeX(Integer attributeX) {
		this.attributeX = attributeX;
	}

	public Integer getAttributeY() {
		return attributeY;
	}

	public void setAttributeY(Integer attributeY) {
		this.attributeY = attributeY;
	}
	
	public SubSubPrototype getSubSubPrototype() {
		return subSubPrototype;
	}
	
	public void setSubSubPrototype(SubSubPrototype subSubPrototype) {
		this.subSubPrototype = subSubPrototype;
	}

}
