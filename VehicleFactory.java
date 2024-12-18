package edu.spring_lessons.factory;

import java.io.FileReader;
import java.lang.reflect.Constructor;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class VehicleFactory {
	
	public static Vehicle createVehicle(Engine engine) {
		//Factory method is a static method that creates an object of a type 
		Vehicle vehicle=null;
		JSONParser js = new JSONParser();
		String typename="vehiclename";
		String errmessage="not a vehicle";
		String errorsource="VehicleFactory.createVehicle";
		try {
			JSONObject jsobj = (JSONObject) js.parse(new FileReader(CommonStrings.SETTING_FILE));
			String classname = (String) jsobj.get(typename);
			Class<?> loadedClass = Class.forName(classname);
			//Constructor<?> constructor = loadedClass.getConstructor();
			Constructor<?> constructor = loadedClass.getConstructor(Engine.class);
			Object obj = constructor.newInstance(engine);
			if (obj instanceof Vehicle) {
				// late binding
				vehicle = (Vehicle) obj;
				
			} else {
				
				LogManager.logErrorMessage(errmessage,errorsource,MessageWarningTypes.INFO);
			}

		} catch (Exception e) {
			LogManager.logErrorMessage(e.getMessage(),errorsource,MessageWarningTypes.ERROR);
		} finally {

		}
		return vehicle;
	}

}
