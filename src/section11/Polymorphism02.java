package section11;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

public class Polymorphism02 {
	
	public static void main(String[] args) {
		SchoolBus sBus1 = new SchoolBus();
		sBus1.drive();
		
		Car car1 = sBus1;
		car1.drive();
		
		Bus bus1 = (Bus) car1;
		bus1.drive();
	}

}
