
public class GCD {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		
		System.out.println(gcd(x,y));
	}

	private static int gcd(int x, int y) {
		if(y == 0){
			return x;
		}
		return gcd(y, x % y);
	}

}
