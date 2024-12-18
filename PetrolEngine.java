package edu.spring_lessons.factory;

public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		String source="PetrolEngine";
		String enginetype="it is a petrol engine";
		System.out.println(enginetype);
		LogManager.logErrorMessage(enginetype,source,MessageWarningTypes.INFO);
	 }
	public void start() {
		String source="PetrolEngine.start";
		 String startMessage="Petrol Engine is starting";
		   System.out.println(startMessage);
			LogManager.logErrorMessage(startMessage,source,MessageWarningTypes.INFO);
	   }

	   public void stop() {
		   String source="PetrolEngine.stop";
		   String stopMessage="Petrol Engine is stopping";
		   System.out.println(stopMessage);
			LogManager.logErrorMessage(stopMessage,source,MessageWarningTypes.INFO);
	   }
}
