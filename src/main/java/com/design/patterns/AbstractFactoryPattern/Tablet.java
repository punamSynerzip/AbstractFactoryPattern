package com.design.patterns.AbstractFactoryPattern;

public abstract class Tablet {
	String name;
    
    void prepare(){
        System.out.println("\nCreating " + name);
    }
}
