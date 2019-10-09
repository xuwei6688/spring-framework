package org.springframework.my.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.List;

public class EmailService implements ApplicationEventPublisherAware {
	private List<String> blackList;
	private ApplicationEventPublisher publisher;

	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void sendEmail(String address, String content) {
		if (blackList.contains(address)) {
			System.out.println("before publish" + "thread:" + Thread.currentThread().getId());
			publisher.publishEvent(new BlackListEvent(this, address, content));
			System.out.println("after publish" + "thread:" + Thread.currentThread().getId());
			return;
		}
		System.out.println("发送邮件，address" + address);
	}
}
