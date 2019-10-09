package org.springframework.my.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.TimeUnit;

public class BlackListNotifier {

	@EventListener
	public void processBlackListEvent(BlackListEvent event) {
		System.out.println("hahah");
	}
}
