
public class PrimeNo {

	public static void main(String[] args) {
		int n = 100;
		
		for(int i = 2; i<=n; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
		
	}

	private static boolean isPrime(int number) {
		for(int i=2; i<number; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}

}
