package synchronizedPack;

public class ParkingStats {
	private volatile long numberCars;
	private volatile long numberMotorCycles;
	
	private ParkingCash cash;
	
	private Object controlCars;
	private Object controlMotos;
	public ParkingStats(ParkingCash cash) {
		numberCars =0;
		numberMotorCycles=0;
		this.cash = cash;
		controlCars = new Object();
		controlMotos = new Object();
	}
	
	public void carComein() {
		synchronized(controlCars) {
			numberCars++;
		}
		cash.vehiclePay();
	}

	public void carGoout() {
		synchronized(controlCars) {
		 numberCars--;
		}
		 cash.vehiclePay();
	}
	
	public void motoComein() {
		synchronized(controlMotos) {
		 numberMotorCycles++;
		}
		 cash.vehiclePay();
	}
	
	public synchronized void motoGoout() {
		synchronized(controlMotos) {
			 numberMotorCycles--;
			}
		 cash.vehiclePay();
	}

	public long getNumberCars() {
		synchronized (controlCars) {
			return numberCars;
		}
	}

	public long getNumberMotorCycles() {
		synchronized(controlMotos) {
			return numberMotorCycles;
			}
		
	}
	
}
