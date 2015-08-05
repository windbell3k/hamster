package org.windbell.lab.hamster.xstream.entity;

import java.sql.Timestamp;
import java.util.List;

import org.windbell.lab.hamster.xstream.utils.TimeStampConvertor;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
@XStreamAlias("message")
public class Message {
	@XStreamOmitField
	private Integer id;
	@XStreamAlias("des")
	private String des;
	@XStreamImplicit
	private  List<MessageContent> serviceContents;
	@XStreamAlias("timeStamp")
	@XStreamConverter(TimeStampConvertor.class)
	private Timestamp time;
	
	
	public Message() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public List<MessageContent> getServiceContents() {
		return serviceContents;
	}
	public void setServiceContents(List<MessageContent> serviceContents) {
		this.serviceContents = serviceContents;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	

}
