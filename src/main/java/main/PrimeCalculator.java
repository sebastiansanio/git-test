package main;

public class PrimeCalculator {

	public static boolean isPrime(long number){
		
		if(number < 2){
			return false;
		}
		if(number == 2){
			return true;
		}
		if(number % 2 == 0){
			return false;
		}
		long toNumber = ((long) Math.sqrt(number)) + 1;
		
		for(long i = 3; i < toNumber; i = i + 2){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	
}
