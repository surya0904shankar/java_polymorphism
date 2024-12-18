package edu.spring_lessons.factory;

public class Ship implements Vehicle {
	private final Engine engine;

    public Ship(Engine engine) {
        this.engine = engine;
    }    
	
public void start() {
	String source="Ship.start";
	 String startMessage="you are starting a ship";
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
	String source="Ship.move";
	String moveMessage="you are moving a ship";
	System.out.println(moveMessage);
	LogManager.logErrorMessage(moveMessage,source,MessageWarningTypes.INFO);
}
public void turn() {
	String source="Ship.turn";
	 String turnMessage="you are turning a ship";
	System.out.println(turnMessage);
	LogManager.logErrorMessage(turnMessage,source,MessageWarningTypes.INFO);}
public void stop() {
	String source="Ship.stop";
	String stopMessage="you are stopping a ship";
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
