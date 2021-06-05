package br.com.wbs.creational.prototype;

public class SubSubPrototype {

	private Boolean isSubSubPrototype;
	private SubPrototype subPrototype;
	
	public SubSubPrototype(Boolean isSubSubPrototype) {
		this.isSubSubPrototype = isSubSubPrototype;
	}

	public Boolean getIsSubSubPrototype() {
		return isSubSubPrototype;
	}
	
	public void setSubPrototype(SubPrototype subPrototype) {
		this.subPrototype = subPrototype;
	}
	public SubPrototype getSubPrototype() {
		return subPrototype;
	}

}
