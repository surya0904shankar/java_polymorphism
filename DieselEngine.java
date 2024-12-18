package edu.spring_lessons.factory;

public class DieselEngine implements Engine {
	   
	public DieselEngine() {
		String source="DieselEngine";
		String enginetype="it ia a diesel engine";
		System.out.println(enginetype);
		LogManager.logErrorMessage(enginetype,source,MessageWarningTypes.INFO);
	 }
   public void start() {
	   String source="DieselEngine.start";
	   String startMessage="Diesel Engine is starting";
	   System.out.println(startMessage);
		LogManager.logErrorMessage(startMessage,source,MessageWarningTypes.INFO);
   }

   public void stop() {
	   String source="DieselEngine.stop";
	   String stopMessage="Diesel Engine is stopping";
	   System.out.println(stopMessage);
		LogManager.logErrorMessage(stopMessage,source,MessageWarningTypes.INFO);
   }
}
