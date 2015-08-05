package org.windbell.lab.hamster.xstream;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;

import org.windbell.lab.hamster.xstream.entity.Message;
import org.windbell.lab.hamster.xstream.entity.MessageContent;

import com.thoughtworks.xstream.XStream;

public class XStreamTest {
	private static String xml = "<message>"
			+ "<des>This is a XStream test</des>" + "<content>"
			+ "<head>This is message head:1</head>"
			+ "<bady>This is message bady:1</bady>" + "</content>"
			+ "<content>" + "<head>This is message head:2</head>"
			+ "<bady>This is message bady:2</bady>" + "</content>"
			+ "<timeStamp>2015-08-05 17:58:05</timeStamp>" + "</message>";
	public static void main(String[]args){
		Message message=new Message();
		message.setDes("This is a XStream test");
		message.setId(1);
		List<MessageContent> list=new ArrayList<MessageContent>();
		for(int i=1;i<3;i++){
			MessageContent messageContent = new MessageContent();
			messageContent.setBady("This is message bady:"+i);
			messageContent.setHead("This is message head:"+i);
			list.add(messageContent);
		}
		message.setServiceContents(list);
		message.setTime(new Timestamp(new Date().getTime()));
		String xml = entityToString(message,Message.class);
		System.out.println("The xml string is:\n"+"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+xml);
		Message entityFromXML = getEntityFromXML(xml,Message.class);
		System.out.println(JSONObject.fromObject(entityFromXML));
	}
	private static <T> String entityToString(Message message,Class<T> c) {
		XStream xStream = new XStream();
		xStream.autodetectAnnotations(true);
		xStream.processAnnotations(c);
		String xml = xStream.toXML(message);
		return xml;
	}
	private static <T> T getEntityFromXML(String xml,Class<T> c){
		XStream xStream = new XStream();
		xStream.autodetectAnnotations(true);
		xStream.processAnnotations(c);
		@SuppressWarnings("unchecked")
		T fromXML = (T)xStream.fromXML(xml);
		return fromXML;
	}
}
