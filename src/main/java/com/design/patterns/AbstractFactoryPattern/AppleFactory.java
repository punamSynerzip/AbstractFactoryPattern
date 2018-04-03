package com.design.patterns.AbstractFactoryPattern;

public class AppleFactory implements AbstractFactory{

	public Phone createPhone(String type) {
		return new IPhone();
	}

	public Tablet createTablet(String type) {
		return new IPad();
	}

}
