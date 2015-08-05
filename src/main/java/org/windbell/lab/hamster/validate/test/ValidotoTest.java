package org.windbell.lab.hamster.validate.test;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import net.sf.json.JSONObject;

import org.windbell.lab.hamster.validate.entity.SingleMessage;
import org.windbell.lab.hamster.validate.value.Value;

import com.thoughtworks.xstream.XStream;

public class ValidotoTest {
	public static void main(String[]args){
		String regex="^[O|P]{1}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher("adfd");
		String str="o";
		boolean matches = str.matches(regex);
		System.out.println(matches);
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		SingleMessage entityFromXML = getEntityFromXML(Value.SINGEL,SingleMessage.class);
		entityFromXML.setBizNo("");
		entityFromXML.setServiceId("aaa");
		entityFromXML.setAmount("");
		Set<ConstraintViolation<SingleMessage>> validate = validator.validate(entityFromXML);
		for (ConstraintViolation<SingleMessage> constraintViolation : validate) {
			System.out.println(constraintViolation.getMessage());
		}
		
		System.out.println("".matches("^[\\S]+"));
		System.out.println(JSONObject.fromObject(entityFromXML));
	}
	private static <T>T getEntityFromXML(String xml,Class<T> c){
		XStream xStream = new XStream();
		xStream.autodetectAnnotations(true);
		xStream.processAnnotations(c);
		@SuppressWarnings("unchecked")
		T fromXML = (T)xStream.fromXML(xml);
		return fromXML;
	}
}
