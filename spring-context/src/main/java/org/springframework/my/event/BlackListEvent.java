package org.springframework.my.event;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;
	private final String address;
	private final String content;


	public BlackListEvent(Object source, String address, String content) {
		super(source);
		this.address = address;
		this.content = content;
	}

	@Override
	public String toString() {
		return "BlackListEvent{" +
				"address='" + address + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
