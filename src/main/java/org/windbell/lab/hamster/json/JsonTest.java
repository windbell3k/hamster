package org.windbell.lab.hamster.json;



public class JsonTest {

	public static void main(String[] args) {
//		net.sf.json.JSONObject jso = new net.sf.json.JSONObject();
//		jso.put("a", 1);
//		jso.put("b", "2");
//		System.out.println(jso.toString());
		
//		com.alibaba.fastjson.JSONObject jso = new com.alibaba.fastjson.JSONObject();
//		jso.put("a", 1);
//		jso.put("b", "2");
		
//		com.alibaba.fastjson.JSONArray jsonArray = new com.alibaba.fastjson.JSONArray();
//		jsonArray.add(jso);
//		jsonArray.add(jso);
//		
//		com.alibaba.fastjson.JSONObject jso1 = new com.alibaba.fastjson.JSONObject();
//		jso1.put("chart", jso);
//		jso1.put("data", jsonArray);
		
	}

}
class Student{
	Integer id;
	String name;
	Integer age;
	
	public Student() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}