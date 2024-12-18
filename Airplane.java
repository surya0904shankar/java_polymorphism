package edu.spring_lessons.factory;

public class Airplane implements Vehicle {
	 private final Engine engine;

	    public Airplane(Engine engine) {
	        this.engine = engine;
	    }		
	public void start() {
		String source="Airplane.start";
		 String startMessage="you are starting a airplane";
		System.out.println(startMessage);
		LogManager.logErrorMessage(startMessage,source,MessageWarningTypes.INFO);
		if(engine!=null) {
			engine.start();
		}
		else {
			String engineError="Engine not found";
			System.out.println(engineError);
			LogManager.logErrorMessage(engineError,source,MessageWarningTypes.INFO);
		}
	}
	public void move() {
		String source="Airplane.move";
		String moveMessage="you are moving a airplane";
		System.out.println(moveMessage);
		LogManager.logErrorMessage(moveMessage,source,MessageWarningTypes.INFO);
	}
	public void turn() {
		String source="Airplane.turn";
		String turnMessage="you are turning a airplane";
		System.out.println(turnMessage);
		LogManager.logErrorMessage(turnMessage,source,MessageWarningTypes.INFO);}
	public void stop() {
		String source="Airplane.stop";
		String stopMessage="you are stopping a airplane";
		System.out.println(stopMessage);
		LogManager.logErrorMessage(stopMessage,source,MessageWarningTypes.INFO);
		if(engine!=null) {
			engine.stop();
		}
		else {
			String engineError="Engine not found";
			System.out.println(engineError);
			LogManager.logErrorMessage(engineError,source,MessageWarningTypes.INFO);
		}
	}
}
