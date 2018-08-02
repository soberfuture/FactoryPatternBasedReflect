package com.reflectfactory;

public class FactoryTest {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Fruit fruit = factory.getInstance("orange");
		fruit.eat();
	}
}
