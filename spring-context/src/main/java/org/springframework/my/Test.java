package org.springframework.my;

import org.springframework.beans.my.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");
		Car car = context.getBean("car", Car.class);
		System.out.println(car);
	}
}
