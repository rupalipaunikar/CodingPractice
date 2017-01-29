
public class Fibonacci {

	public static void main(String[] args) {
		int n = 8;
		
		//recursion
		for(int i=0; i<=n; i++){
			System.out.println(fibonacciRecursion(n) +", ");
		}
		
		//loop
		fibonacciLoop(n);
		
		
	}
	
	private static int fibonacciRecursion(int n){
		if(n==1 || n==2){
			return 1;
		}
		
		return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
		
	}
	
	private static void fibonacciLoop(int n){
		if(n==1 || n==2){
			for(int i=1; i<=n; i++){
				System.out.print(1 + ", ");
			}
		}
		
		int fibo1=0, fibo2=1, fibonacci=1;
		for(int i=1; i<=n; i++){
			fibonacci = fibo1+fibo2;
			fibo1=fibo2;
			fibo2=fibonacci;
			
			System.out.print(fibonacci + ", ");
		}
		
	}
}
