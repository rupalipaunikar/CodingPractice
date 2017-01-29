
public class Palindrome {

	public static void main(String[] args) {
		int n = 121;
		
		if(isPalindrome(n)){
			System.out.println(n + " is a palindrome");
		}
		else{
			System.out.println(n + " is not a palindrome");
		}
	}

	private static boolean isPalindrome(int n) {
		int reverse = 0, remainder = 0;
		int original = n;

		if(n < 10){
			return true;
		}
		
		do{
			remainder = n % 10;
			reverse = reverse*10 + remainder;
			n = n / 10;
		}while(n > 0);
		
		if(reverse == original){
			return true;
		}
		return false;
	}

}
