
public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func(10));
		System.out.println(factorial(0));
		System.out.println(power(2, 10));
		
		for(int i = 1 ; i< 10 ; i++) {
			System.out.print(fibonachi(i)+"\t");
		}
		System.out.println("\n"+gcd(24, 16));
	}

	public static int func(int i) {
//		base case : condition to get out from recursion
		if (i == 0)
			return 0;
//		recursive case
		else {
			if(i == 1)
				System.out.print("1 = ");
			else
				System.out.print(i + " + " );
			return i + func(i - 1);
		}
	}
	
	public static int factorial(int n) {
		if(n == 0) {
			System.out.print("0! = ");
			return 1;
		}
		else if(n ==1) {
			System.out.print("1 = ");
			return 1;
		}
		else {
			System.out.print(n + " * ");
			return n*factorial(n-1);
		}
	}
	
	public static double power(double x, int n) {
		if(n == 0) 
			return 1;
		else
			return x*power(x,n-1);
	}
	
	public static int fibonachi(int n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fibonachi(n-1) + fibonachi(n-2);
	}
	
	public static int gcd(int m, int n) {
		if(m<n) {
			int temp = m;
			m = n;
			n = temp;
		}
		/*if(m%n == 0)
			return n;
		else
			return gcd(n,m%n);*/
		return (m%n)==0 ? n : gcd(n,m%n); 
	}
}
