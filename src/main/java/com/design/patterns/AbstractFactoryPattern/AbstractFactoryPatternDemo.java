package com.design.patterns.AbstractFactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) throws IOException {
		AbstractFactory abstractFactory;
		Phone phone;
		Tablet tablet;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String company = "";
		
		System.out.println("Enter company name: ");
		company = br.readLine();
		
		if(company.equalsIgnoreCase("apple")){
			abstractFactory = new AppleFactory();
			phone = abstractFactory.createPhone("phone");
			phone.prepare();
			tablet = abstractFactory.createTablet("tablet");
			tablet.prepare();
		}
		else if (company.equalsIgnoreCase("samsung")) {
			abstractFactory = new SamsungFactory();
            phone = abstractFactory.createPhone("phone");
            phone.prepare();
            tablet = abstractFactory.createTablet("tablet");
            tablet.prepare();
		}
		else {
			System.out.println("Sorry!! This company product not avaialbe");
		}
		
	}
}
