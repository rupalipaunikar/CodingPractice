
public class ReverseNumber {

	public static void main(String[] args) {

		int n = 123;
		
		System.out.println(reverse(n));
		
	}

	private static int reverse(int n) {
		
		if(n < 10){
			return n;
		}
		
		int reverse = 0;
		int remainder = 0;
		
		do{
			remainder = n % 10;
			reverse = reverse *10 + remainder;
			n = n/10;
		}while(n>0);
		return reverse;
	}

	

}
