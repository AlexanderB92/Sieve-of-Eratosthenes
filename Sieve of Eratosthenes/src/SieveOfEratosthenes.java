import java.util.ArrayList;

public class SieveOfEratosthenes {
	
	private int numberLimit;
	
	public SieveOfEratosthenes(int limit) {
		this.numberLimit = limit;
	}
	
	public ArrayList<Integer> getPrimes() {
		
		//Result list
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		//Prime array
		boolean[] primes = new boolean[numberLimit+1];
		
		//Set all booleans in primes[] to true
		for(int p = 0; 0 < numberLimit; p++) {
			primes[p] = true;
		}
		
		//Start from first prime (2) until square root of numberLimit - because n = a * b, and if a > sqrt(n), then b must be smaller and vice versa
		for(int i = 2; i * i <= numberLimit; i++) {
		
			//Check if i is prime to avoid duplicate iterations
			if(primes[i] == true) {
				result.add(i);
								
				//Mark all multiples of i (m+=i adding faster than multiplication)
				for(int m = i*i; m <= numberLimit; m+=i)	 {
					primes[m] = false;
				}
			}
		}
		
		return result;
	}

}
