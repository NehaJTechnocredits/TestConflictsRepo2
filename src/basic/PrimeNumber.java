package basic;

public class PrimeNumber {
	void verifyIfNumberIsPrime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				//System.out.println(number + " is not prime number");
				break;
			}
		}
		if (status)
			System.out.println(number + " is prime number");

	}

	void verifyPrimeNumberInRange(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			verifyIfNumberIsPrime(index);
		}
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.verifyPrimeNumberInRange(10, 100);
		System.out.println("End");
	}
}
