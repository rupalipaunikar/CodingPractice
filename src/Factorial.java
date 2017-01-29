
public class Factorial {

	public static void main(String[] args) {
		
		int n=6;
		
		System.out.println(factorialLoop(n));
	}

	private static int factorialRecursion(int n) {
		
		if(n == 0){
			return 1;
		}
		
		return n*factorialRecursion(n-1);
	}

	private static int factorialLoop(int n){
		
		int result =1;
		while(n>0){
			result *= n;
			n--;
		}
		
		return result;
		
	}
}
