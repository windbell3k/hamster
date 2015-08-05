package org.windbell.lab.hamster.xstream.utils;

import java.sql.Timestamp;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class TimeStampConvertor implements Converter{

	public void marshal(Object source, HierarchicalStreamWriter writer,
			MarshallingContext context) {
		Timestamp timestamp = null;
		if(source != null ){
			timestamp = (Timestamp) source;
		}
		if(timestamp != null){
			String val = "";
			if(timestamp.toString().indexOf(".") != -1){
				val = timestamp.toString().substring(0, timestamp.toString().indexOf("."));
			}
			writer.setValue(val);
		}else{
			writer.setValue("");
		}
		
	}

	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {

		Timestamp timestamp = Timestamp.valueOf(reader.getValue());
		
		return timestamp;
	}

	public boolean canConvert(Class type) {
		 return type.equals(Timestamp.class);
	}

}
