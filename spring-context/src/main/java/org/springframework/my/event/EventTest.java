package org.springframework.my.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		EmailService emailService = ctx.getBean("emailService", EmailService.class);
		emailService.sendEmail("known.spammer@example.org", "hello");

	}
}
