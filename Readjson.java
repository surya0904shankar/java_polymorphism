package edu.spring_lessons.factory;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.*;

public class Readjson {

	public static void main(String[] args) {
		JSONParser js=new JSONParser();
		try {
			JSONObject jsobj=(JSONObject)js.parse(new FileReader("C:\\mysql_jdbc\\mysql-connector-j-9.0.0\\mysql-connector-j-9.0.0\\src\\json\\read.json"));
			String name=(String) jsobj.get("name");
			Long age=(Long)jsobj.get("age");
			String city=(String)jsobj.get("city");
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(city);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
