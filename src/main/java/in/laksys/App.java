package in.laksys;

//main class
public class App {
	public static int gcd(int m, int n) {
		if ( n == 0 )
			return m;
		else
			return gcd(n, m%n);
	}
	public static int add( int a, int b) {
		int result = a + b;
		return result;
	}
	public static boolean isOdd(int num) {
		if( num % 2 == 1)
			return true;
		else
			return false;
	}
	public static boolean isEven(int num) {
		if ( num % 2 == 0 )
			return true;
		return false;
	}
	public static boolean isEven2(int num) {
		return num % 2 == 0;
	}
}
