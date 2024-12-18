package edu.spring_lessons.factory;

public class Car implements Vehicle {
	private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public Car(String color) {
    	engine=new PetrolEngine();
    }
   
   
   
    
	
public void start() {
	String source="Car.start";
	 String startMessage="you are starting a car";
	System.out.println(startMessage);
	LogManager.logErrorMessage(startMessage,source,MessageWarningTypes.INFO);
	if(engine!=null) {
		engine.start();
	}
	else {
		String engineerror="Engine not found";
		System.out.println(engineerror);
		LogManager.logErrorMessage(engineerror,source,MessageWarningTypes.INFO);
	}
}
public void move() {
	String source="Car.move";
	 String moveMessage="you are moving a car";
	System.out.println(moveMessage);
	LogManager.logErrorMessage(moveMessage,source,MessageWarningTypes.INFO);
}
public void turn() {
	String source="Car.turn";
	 String turnMessage="you are turning a car";
	System.out.println(turnMessage);
	LogManager.logErrorMessage(turnMessage,source,MessageWarningTypes.INFO);}
public void stop() {
	String source="Car.stop";
	 String stopMessage="you are stopping a car";
	System.out.println(stopMessage);
	LogManager.logErrorMessage(stopMessage,source,MessageWarningTypes.INFO);
	if(engine!=null) {
		engine.stop();
	}
	else {
		String engineerror="Engine not found";
		System.out.println(engineerror);
		LogManager.logErrorMessage(engineerror,source,MessageWarningTypes.INFO);
	}
}

}
