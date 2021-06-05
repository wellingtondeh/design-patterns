package br.com.wbs.creational.prototype;

public class App {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		SubPrototype subSubOfSubPrototype = new SubPrototype();
		subSubOfSubPrototype.setAttributeX(30);
		subSubOfSubPrototype.setAttributeY(40);
		
		SubSubPrototype subSubPrototype = new SubSubPrototype(true);
		subSubPrototype.setSubPrototype(subSubOfSubPrototype);
		
		
		SubPrototype subPrototype = new SubPrototype();
		subPrototype.setAttributeX(10);
		subPrototype.setAttributeY(20);
		subPrototype.setSubSubPrototype(subSubPrototype);
		
		Prototype mainPrototype = new Prototype();
		mainPrototype.setAttributeA("Prototype Attribute A");
		mainPrototype.setAttributeB("Prototype Attribute B");
		mainPrototype.setSubPrototype(subPrototype);
		
		Prototype clone = mainPrototype.clone();
		System.out.println(clone.getAttributeA());
		System.out.println(clone.getAttributeB());
		System.out.println(clone.getSubPrototype().getAttributeX());
		System.out.println(clone.getSubPrototype().getAttributeY());
		System.out.println(clone.getSubPrototype().getSubSubPrototype().getIsSubSubPrototype());
		System.out.println(clone.getSubPrototype().getSubSubPrototype().getSubPrototype().getAttributeX());
		System.out.println(clone.getSubPrototype().getSubSubPrototype().getSubPrototype().getAttributeY());
	}

}
