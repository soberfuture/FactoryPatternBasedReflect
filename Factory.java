package com.reflectfactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Factory {
	public Fruit getInstance(String className) {
		Fruit fruit = null;
		Properties properties = new Properties();
		try {
			properties.load(new FileReader("C:\\Users\\sober\\Desktop\\application.txt"));//配置文件路径
			fruit = (Fruit) Class.forName(properties.getProperty(className)).newInstance();//通过反射机制创建对象
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fruit;
	}
}
