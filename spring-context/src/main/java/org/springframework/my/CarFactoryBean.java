package org.springframework.my;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.my.Car;

public class CarFactoryBean implements FactoryBean<Car> {
	@Override
	public Car getObject() throws Exception {
		Car car = new Car("宝马", "黑色", 34);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
