package synchronizedPack;

public class ParkingCash {

	private static final int cost = 0;
	private long cash;
	public ParkingCash() {
		cash =0;
	}
	
	public synchronized void vehiclePay() {
		cash+=cost;
	}
	
	public void close() {
		System.out.println("Closing account= "+cash);
		long totalAmount;
		synchronized (this) {
			totalAmount=cash;
			cash=0;
		}
		
		System.out.println("The total amount is "+totalAmount);
	}
}