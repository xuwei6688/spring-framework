package org.springframework.my.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config{
	@Bean
	public EmailService emailService() {
		EmailService emailService = new EmailService();
		List<String> list = new ArrayList<>();
		list.add("@Compent");
		emailService.setBlackList(list);
		return emailService;
	}

	@Bean
	public BlackListNotifier blackListNotifier() {
		return new BlackListNotifier();
	}
}
