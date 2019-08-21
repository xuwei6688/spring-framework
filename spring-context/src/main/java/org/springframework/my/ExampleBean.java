package org.springframework.my;

import org.springframework.beans.BeansException;
import org.springframework.beans.my.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class ExampleBean implements ApplicationContextAware {
	private Car car;
	private ApplicationContext context;

	public ExampleBean() {
	}

	public ExampleBean(Car car) {
		this.car = car;
	}

	public void printCar() {
//		Object car = context.getBean("car");
		System.out.println(creatCar());
	}

	protected abstract Car creatCar();

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "ExampleBean{" +
				"car=" + car +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
}
