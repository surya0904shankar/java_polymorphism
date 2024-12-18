package edu.spring_lessons.factory;
import java.lang.reflect.Constructor;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		// createVehicleObjects();
		testVehiclewithEngine();
		testLogManager();
		System.out.println("Completed");
	}

	public static void testVehicle() {
		// load the class and create object for the class based on user input at run
		// time
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the engine type");
		String classname = sc.nextLine();
		try {
			Class<?> loadedClass = Class.forName(classname);
			Constructor<?> constructor = loadedClass.getConstructor();
			Object obj = constructor.newInstance();
			if (obj instanceof Engine) {
				// early binding
				// Vehicle firstVehicle=new Car();
				// late binding
				Vehicle veh = (Vehicle) obj;
				// callVehicleMethods(veh);
			} else {
				System.out.println("not a vehicle");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	
	}

	private static void callVehicleMethods(Vehicle obj_vehicle) {
		obj_vehicle.start();
		obj_vehicle.move();
		obj_vehicle.turn();
		obj_vehicle.stop();

	}


	private static void testVehiclewithEngine() {
		Engine engine = EngineFactory.createEngine();
		
		// new PetrolEngine();//late binding
		
// DI Dependency Injection
// as we are injecting the engine using the constructor, so this is called as constructor based DI
// if we are 
		
		Vehicle car = VehicleFactory.createVehicle(engine);
		callVehicleMethods(car);
		
	}
	private static void testLogManager() {
		String message="This is a test";
		String from ="TestLogManager";
		LogManager.logErrorMessage(message, from,MessageWarningTypes.INFO);
	}
}
