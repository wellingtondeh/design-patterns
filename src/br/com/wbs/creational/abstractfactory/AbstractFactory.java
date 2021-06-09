package br.com.wbs.creational.abstractfactory;

import java.util.Arrays;
import java.util.List;

public class AbstractFactory {

	private List<Render> renders;
	
	public AbstractFactory(GUIFactory factory) {
		renders = Arrays.asList(
									factory.createButton(),
									factory.createCheckbox(),
									factory.createCombobox()
								);
	}
	
	public void paint() {
		renders.forEach(Render::paint);	
	}
	
}
