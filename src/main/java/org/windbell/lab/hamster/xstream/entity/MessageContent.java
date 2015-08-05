package org.windbell.lab.hamster.xstream.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("content")
public class MessageContent {
	@XStreamAlias("head")
	private String head;
	@XStreamAlias("bady")
	private String bady;
	
	
	public MessageContent() {
		super();
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getBady() {
		return bady;
	}
	public void setBady(String bady) {
		this.bady = bady;
	}
	
}
