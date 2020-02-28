package arrayPractice;

public class Calculator implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long current = 1L;
		long max = 20000L;
		long numPrimes = 0L;
		System.out.printf("Start.. Current thread name%s\n",Thread.currentThread().getName());
		while(current<= max) {
			if(isPrime(current)) {
				numPrimes++;
			}
			current++;
		}
		System.out.printf("Thread  %s End .. No. of Primes %d\n",Thread.currentThread().getName(),numPrimes);
	}

	private boolean isPrime(long number) {
		if(number<=2) {
			return true;
		}
		for(long i=2;i<number;i++) {
			if((number%i)==0) {
				return false;
			}
		}
		return true;
	}
}
