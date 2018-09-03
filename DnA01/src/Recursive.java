
public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func(10));
		System.out.println(factorial(0));
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
}
