package org.springframework.my;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.my.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.my.event.EmailService;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		UserManager userManager = ctx.getBean("userManager", UserManager.class);
//		System.out.println(userManager);
//		EmailService emailService = ctx.getBean("emailService", EmailService.class);
//		emailService.sendEmail("known.spammer@example.org", "hello");

//		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//		Resource[] resources = resolver.getResources("classpath:/beans.xml");
//
//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//		reader.loadBeanDefinitions(resources);
//
//		beanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
//
		Car car = ctx.getBean("car", Car.class);
		System.out.println(car);
	}
}
