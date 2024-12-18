package edu.spring_lessons.factory;

import java.io.FileReader;
import java.lang.reflect.Constructor;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class EngineFactory {
	public static Engine createEngine() {
		Engine engine=null;
		JSONParser js = new JSONParser();
		String typename="enginetype";
		String errmessage="not an Engine";
		String errorsource="EngineFactory.createEngine";
		try {
			JSONObject jsobj = (JSONObject) js.parse(new FileReader(CommonStrings.SETTING_FILE));
			String classname = (String) jsobj.get(typename);
			Class<?> loadedClass = Class.forName(classname);
			Constructor<?> constructor = loadedClass.getConstructor();
			Object obj = constructor.newInstance();
			if (obj instanceof Engine) {

				engine = (Engine) obj;

			} else {
				LogManager.logErrorMessage(errmessage,errorsource,MessageWarningTypes.INFO);
			}

		} catch (Exception e) {
			LogManager.logErrorMessage(e.getMessage(),errorsource,MessageWarningTypes.ERROR);
		} finally {

		}

		return engine;
	}

}
