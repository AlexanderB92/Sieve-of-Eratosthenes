package amb.SieveOfEratosthenes;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		SieveOfEratosthenes sieve = new SieveOfEratosthenes(1000);
		
		ArrayList<Integer> primes = sieve.getPrimes();
		
		for(Integer i : primes) {
			System.out.println(i);
		}

	}

}
