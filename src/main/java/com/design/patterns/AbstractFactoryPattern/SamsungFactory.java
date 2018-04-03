package com.design.patterns.AbstractFactoryPattern;

public class SamsungFactory implements AbstractFactory {

	public Phone createPhone(String type) {
		return new SamsungPhone();
	}

	public Tablet createTablet(String type) {
		return new SamsungTablet();
	}

}
