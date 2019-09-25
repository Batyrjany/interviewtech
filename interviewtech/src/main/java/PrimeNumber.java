import com.github.javafaker.Faker;

public class PrimeNumber {

	public static void main(String[] args) {

		Faker faker = new Faker();

		int f = faker.number().randomDigit();
		System.out.println(f);
		System.out.println(checkPrime( f));
		

	}
	
	
	
	public static boolean checkPrime(int f) {

		if(f<=1){
			return false;
		}

		for (int i = 2; i < f; i++) {

			if(f % i == 0) {
				return false;
			}
		}
		
		
		return true;
		
	}

}
