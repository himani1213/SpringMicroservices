package synchronizedPack;

public class Main {

	public static void main(String[] args) {

		ParkingCash cash = new ParkingCash();
		ParkingStats stats = new ParkingStats(cash);
		System.out.println("Parking Simulator: ");
		
		int numSensors = 2* Runtime.getRuntime().availableProcessors();
		Thread threads[] = new Thread[numSensors];
		for(int i=0;i<threads.length;i++) {
			Sensor sensor = new Sensor(stats);
			Thread thread = new Thread(sensor);
			thread.start();
			threads[i] = thread;
		}
		
		for(int i=0;i<threads.length;i++) {
			try {
				threads[i].join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("No. of cars in Parking: "+stats.getNumberCars());
		System.out.println("No. of MotorBikes in Parking: "+stats.getNumberMotorCycles());
		cash.close();
	}

}
