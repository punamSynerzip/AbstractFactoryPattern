package com.design.patterns.AbstractFactoryPattern;

public abstract class Phone {
	String name;
    
    void prepare(){
        System.out.println("\nCreating "+ name);
    }
}
