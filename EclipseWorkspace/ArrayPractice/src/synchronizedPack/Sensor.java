package synchronizedPack;

import java.util.concurrent.TimeUnit;

public class Sensor implements Runnable{
	private ParkingStats stats;
	
	public Sensor(ParkingStats stats) {
		this.stats = stats;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			stats.carComein();
			stats.carComein();
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			stats.motoComein();
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			stats.motoGoout();
			stats.carGoout();
			stats.carGoout();
		}
		
	}
	
	

}
