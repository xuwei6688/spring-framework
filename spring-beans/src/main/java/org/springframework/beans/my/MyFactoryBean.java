package org.springframework.beans.my;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		Car car = new Car();
		car.setBrand("别克");
		car.setColor("黑");
		car.setMaxSpeed(45);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
}
