
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 372;
		
		if(isArmstrong(n)){
			System.out.println(n+" is an armstrong number");
		}
		else{
			System.out.println(n+" is not an armstrong number");
		}
	}

	private static boolean isArmstrong(int n) {
		int result = 0;
		int original = n;
		int remainder = 0;
		
		while(n != 0){
			remainder = n % 10;
			result = result + remainder*remainder*remainder;
			n = n/10;
		}
		
		if(original == result){
			return true;
		}
		return false;
	}

}
