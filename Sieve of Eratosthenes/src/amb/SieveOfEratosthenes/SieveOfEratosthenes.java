package amb.SieveOfEratosthenes;

import java.util.ArrayList;

public class SieveOfEratosthenes {

	private int numberLimit;

	public SieveOfEratosthenes(int limit) {
		this.numberLimit = limit;
	}

	public void getPrimes() {

		// Prime array
		boolean[] primes = new boolean[numberLimit + 1];

		// Set all booleans in primes[] to true
		for (int p = 0; p < numberLimit; p++) {
			primes[p] = true;
		}

		// Start from first prime (2) until square root of numberLimit - because n = a * b, and if a > sqrt(n), then b must be smaller and vice versa 
		for (int i = 2; i * i <= numberLimit; i++) {

			// Check if i is prime to avoid duplicate iterations
			if (primes[i] == true) {

				// Mark all multiples of i (m+=i adding faster than multiplication)
				for (int m = i * i; m <= numberLimit; m += i) {
					primes[m] = false;
				}
			}
		}

		for (int i = 2; i <= numberLimit; i++) {
			if (primes[i] == true) {
				System.out.println(i);
			}
		}
	}

}
