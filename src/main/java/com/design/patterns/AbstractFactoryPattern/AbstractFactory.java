package com.design.patterns.AbstractFactoryPattern;

public interface AbstractFactory { 
	public Phone createPhone(String type); 
	public Tablet createTablet(String type);
}
