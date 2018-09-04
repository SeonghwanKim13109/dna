
public class Recursive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringLenth("i love you"));
		printString("i love you");
		
		reversePrintString("i love you");
		System.out.println();
		
		printBinary(10,"");
		System.out.println();
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sumOfArray(arr, arr.length-1));
	}
	
	public static int stringLenth(String str) {
		if(str.equals(""))
			return 0;
		else
			return 1+stringLenth(str.substring(1));
	}
	
	public static void printString(String str) {
		if(stringLenth(str) == 0) {
			System.out.println();
			return;
		}
		else {
			System.out.print(str.charAt(0));
			printString(str.substring(1));
		}
	}
	
	public static void reversePrintString(String str) {
		char temp;
		if(stringLenth(str) == 0)
			return;
		else {
			temp = str.charAt(0);
			reversePrintString(str.substring(1));
			System.out.print(temp);
		}
	}
	
	public static void printBinary(int n,String str) {
		if(n==0) 
			return;
		else {
			printBinary(n/2,str);
			System.out.print(n%2);
		}
	}
	
	public static int sumOfArray(int[] arr, int n) {
		if(arr.length <= 0 || n > arr.length)
			throw new ArrayIndexOutOfBoundsException();
		if(n < 0)
			return 0;
		else {
			return arr[n] + sumOfArray(arr, n-1);
			
		}
	}
}
