package edu.spring_lessons.factory;

public class GasEngine implements Engine {
	  
	public GasEngine() {
		 String enginetype="it is a gas engine";
		String source="GasEngine";
		System.out.println(enginetype);
		LogManager.logErrorMessage(enginetype,source,MessageWarningTypes.INFO);
		 
	 }
	public void start() {
		String source="GasEngine.start";
		 String startMessage="Gas Engine is starting";
		   System.out.println(startMessage);
			LogManager.logErrorMessage(startMessage,source,MessageWarningTypes.INFO);
	   }

	   public void stop() {
		   String source="GasEngine.stop";
		   String stopMessage="Gas Engine is stopping";
		   System.out.println(stopMessage);
			LogManager.logErrorMessage(stopMessage,source,MessageWarningTypes.INFO);
	   }

}
