package amb.SieveOfEratosthenes;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		SieveOfEratosthenes sieve = new SieveOfEratosthenes(10000000);
		
		sieve.getPrimes();

	}

}
