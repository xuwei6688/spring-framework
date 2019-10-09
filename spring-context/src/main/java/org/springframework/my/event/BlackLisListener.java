package org.springframework.my.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;

public class BlackLisListener implements ApplicationListener<BlackListEvent> {
	@Async
	@Override
	public void onApplicationEvent(BlackListEvent event) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Listener thread:" + Thread.currentThread().getId()+ " " + event);
	}
}
